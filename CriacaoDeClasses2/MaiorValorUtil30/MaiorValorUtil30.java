/* Escreva uma classe que contenha métodos estáticos para retornar o maior de dois, três,
quatro e cinco valores, considerando que os argumentos e o retorno dos métodos podem
ser dos tipos int e double. Em outra classe, escreva um aplicativo de teste que, sem criar
objetos, demonstre as capacidades da classe criada. */

package CriacaoDeClasses2.MaiorValorUtil30;

public class MaiorValorUtil30 {
    // Retorna o maior entre dois inteiros
    public static int maiorValor(int a, int b) {
        return Math.max(a, b);
    }

    // Retorna o maior entre três inteiros
    public static int maiorValor(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    // Retorna o maior entre quatro inteiros
    public static int maiorValor(int a, int b, int c, int d) {
        return Math.max(Math.max(Math.max(a, b), c), d);
    }

    // Retorna o maior entre cinco inteiros
    public static int maiorValor(int a, int b, int c, int d, int e) {
        return Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
    }

    // Retorna o maior entre dois números de ponto flutuante (double)
    public static double maiorValor(double a, double b) {
        return Math.max(a, b);
    }

    // Retorna o maior entre três números de ponto flutuante (double)
    public static double maiorValor(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }

    // Retorna o maior entre quatro números de ponto flutuante (double)
    public static double maiorValor(double a, double b, double c, double d) {
        return Math.max(Math.max(Math.max(a, b), c), d);
    }

    // Retorna o maior entre cinco números de ponto flutuante (double)
    public static double maiorValor(double a, double b, double c, double d, double e) {
        return Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
    }
}
