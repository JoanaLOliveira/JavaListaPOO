/* Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina da
Ufersa. Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula,
nome, 2 notas de prova (P1 e P2) e 1 nota de trabalho (T). Escreva os seguintes métodos
para esta classe:
• media: calcula a média parcial do aluno (MP)
– cada prova tem peso 2, 5 e o trabalho tem peso 2 (MP = 2,5×P1+2,5×P2+2×T
7 )
• provaFinal: calcula quanto o aluno precisa para o exame final (EF)
– retorna zero se o launo não necessita realizar o exame final (MP < 3 ouMP >=
7)
– média final MF = (MP × 6 + EF × 4)/10
– é necessário que MF seja maior ou igual a 5 para que o aluno seja aprovado
após realizar o exame final
Escreva um aplicativo de teste que demonstre as capacidades da classe criada. */

package CriacaoDeClasses1.Questao25;

public class Aluno25 {
    private int matricula;
    private String nome;
    private float p1;
    private float p2;
    private float trabalho;

    // Método construtor
    public Aluno25(int matricula, String nome, float p1, float p2, float trabalho){
        this.matricula=matricula;
        this.nome=nome;
        this.p1=p1;
        this.p2=p2;
        this.trabalho=trabalho;
    }
    
    // Método para calcular a média parcial (MP)
    public float calcularMedia(){
        return ((2.5f*p1+2.5f*p2+2f*trabalho)/7f);
    }

    // Método para calcular a nota necessária no exame final (EF)
    public float calcularProvaFinal(){
        float mediaParcial = calcularMedia();
        if (mediaParcial<3||mediaParcial>=7) {
            return 0;
        }else{
            float mediaFinal=(mediaParcial*6+4*mediaParcial)/10;
            return Math.max(0, (5-mediaFinal));
        }
    }

    //Metodo para verificar se o aluno foi aprovado
    public boolean verificarAprovacao(){
        float mediaParcial=calcularMedia();
        if (mediaParcial>=5||calcularProvaFinal()==0) {
            return true;
        }else{
            return false;
        }
    }

    //Getters
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
}
