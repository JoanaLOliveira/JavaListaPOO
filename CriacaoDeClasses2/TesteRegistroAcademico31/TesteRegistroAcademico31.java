/* 
Escreva uma versão da classe RegistroAcademico (vista em aula) que tenha o campo
numeroDeMatriculas declarado como static, e que incremente o valor deste campo cada
vez que uma instância da classe for criada. Use o atributo numeroDeMatriculas para
definir o atributo matricula automaticamente com um valor diferente para cada instância.
Escreva também uma aplicação que crie algumas instâncias da classe para demonstrar
seu funcionamento.
 */


package CriacaoDeClasses2.TesteRegistroAcademico31;

public class TesteRegistroAcademico31 {
    private static int numeroDeMatriculas = 0;
    private int matricula;
    private String nome;
    private int idade;

    // Construtor da classe
    public TesteRegistroAcademico31(String nome, int idade) {
        this.matricula = ++numeroDeMatriculas;
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getters
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Método toString para representar a instância em formato de string
    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Nome: " + nome + ", Idade: " + idade;
    }
}
/* classe RegistroAcademico:
    // Campo estático para armazenar o número total de matrículas
    privado estatico inteiro numeroDeMatriculas = 0

    // Atributos da classe
    privado inteiro matricula
    privado texto nome
    privado inteiro idade

    // Método construtor
    funcao __init__(texto nome, inteiro idade):
        // Incrementa o número total de matrículas e atribui à matrícula da instância atual
        this.matricula = ++numeroDeMatriculas
        this.nome = nome
        this.idade = idade

    // Métodos para obter informações da instância
    funcao obterMatricula():
        retorne this.matricula

    funcao obterNome():
        retorne this.nome

    funcao obterIdade():
        retorne this.idade
 */