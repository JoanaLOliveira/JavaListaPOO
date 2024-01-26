/* Escreva a classe Contador que encapsule um valor usado para contagem de eventos.
Esta classe deve esconder o valor encapsulado de programadores-usuários, fazendo
com que o acesso ao valor seja feito através de métodos que devem zerar, incrementar
e imprimir o valor do contador. Escreva um aplicativo de teste que demonstre as
capacidades da classe criada. */

package CriacaoDeClasses2.Contador27;

public class Contador27 {
    private int valor;

    // Construtor
    public Contador27() {
        this.valor = 0;
    }

    // Método para zerar o contador
    public void zerar() {
        this.valor = 0;
        System.out.println("Contador zerado.");
    }

    // Método para incrementar o contador
    public void incrementar() {
        this.valor++;
        System.out.println("Contador incrementado. Valor atual: " + this.valor);
    }

    // Método para obter o valor do contador
    public int obterValor() {
        return this.valor;
    }

}
