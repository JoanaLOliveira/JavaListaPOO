/* Escreva uma classe para representar um número complexo. Essa classe deve conter
três construtores. Um construtor deverá receber os dois valores (parte real e parte imaginária)
como argumentos, o outro somente o valor real, considerando o imaginário como
sendo zero, e o terceiro construtor não recebe argumentos, considerando as partes real e
imaginária do número complexo como sendo iguais a zero. Escreva um método toString
que apresente o número complexo em notação apropriada (ex.: 2 + 4i) e o use em um
aplicativo de teste que demonstre as capacidades da classe criada. */

package UNIDADE1.CriacaoDeClasses2.NumeroComplexo29;

public class NumeroComplexo29 {
    private double parteReal;
    private double parteImaginaria;

    // Construtor com ambos os valores (parte real e parte imaginária)
    public NumeroComplexo29(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    // Construtor com somente o valor real (imaginário considerado como zero)
    public NumeroComplexo29(double parteReal) {
        this.parteReal = parteReal;
        this.parteImaginaria = 0;
    }

    // Construtor sem argumentos (partes real e imaginária iguais a zero)
    public NumeroComplexo29() {
        this.parteReal = 0;
        this.parteImaginaria = 0;
    }

    // Método toString para apresentar o número complexo em notação apropriada
    @Override
    public String toString() {
        if (parteImaginaria == 0) {
            return String.format("%.2f", parteReal);
        } else if (parteImaginaria > 0) {
            return String.format("%.2f + %.2fi", parteReal, parteImaginaria);
        } else {
            return String.format("%.2f - %.2fi", parteReal, -parteImaginaria);
        }
    }

   
}
