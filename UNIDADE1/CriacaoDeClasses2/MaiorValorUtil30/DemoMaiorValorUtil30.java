package UNIDADE1.CriacaoDeClasses2.MaiorValorUtil30;

public class DemoMaiorValorUtil30 {
    public static void main(String[] args) {
        // Testando os métodos estáticos sem criar objetos

        // Teste com inteiros
        System.out.println("Maior entre 5 e 10: " + MaiorValorUtil30.maiorValor(5, 10));
        System.out.println("Maior entre 3, 8 e 12: " + MaiorValorUtil30.maiorValor(3, 8, 12));
        System.out.println("Maior entre 15, 7, 2 e 10: " + MaiorValorUtil30.maiorValor(15, 7, 2, 10));
        System.out.println("Maior entre 8, 20, 15, 25 e 12: " + MaiorValorUtil30.maiorValor(8, 20, 15, 25, 12));

        // Teste com números de ponto flutuante (double)
        System.out.println("Maior entre 3.5 e 7.8: " + MaiorValorUtil30.maiorValor(3.5, 7.8));
        System.out.println("Maior entre 1.2, 5.6 e 4.1: " + MaiorValorUtil30.maiorValor(1.2, 5.6, 4.1));
        System.out.println("Maior entre 10.9, 8.7, 15.2 e 12.6: " + MaiorValorUtil30.maiorValor(10.9, 8.7, 15.2, 12.6));
        System.out.println("Maior entre 3.2, 6.5, 9.7, 4.1 e 8.0: " + MaiorValorUtil30.maiorValor(3.2, 6.5, 9.7, 4.1, 8.0));
    }
}
