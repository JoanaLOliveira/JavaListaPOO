/* Escreva uma classe para representar um time de um esporte qualquer em um campeonato
desse esporte. Que atributos devem ser representados nessa classe? Quais métodos
ela deve conter? Escreva um aplicativo de teste que demonstre as capacidades da
classe criada. */

package CriacaoDeClasses1.TimeEsportivo23;

public class TimeEsportivo23 {
    private String nome;
    private String cidade;
    private int pontuacao;

    // Construtor
    public TimeEsportivo23(String nome, String cidade, int pontuacao) {
        this.nome = nome;
        this.cidade = cidade;
        this.pontuacao = pontuacao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    // Método para exibir informações do time
    public void exibirInformacoes() {
        System.out.println("Nome do Time: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Pontuação: " + pontuacao);
    }

}