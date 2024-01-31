package UNIDADE1.IntroducaoJava;
/* Duas cidades, A e B, têm populações de 7000 e 20000 habitantes, respectivamente. A
cidade A tem um crescimento populacional de 3, 5% ao ano, enquanto a população da
cidade B cresce 1% ao ano. Faça um programa que utilize laço(s) para calcular a quantidade
de anos necessária para que a população da cidade A seja maior ou igual a população
da cidade B. */

public class CrescimentoPopulacional17 {
    public static void main(String[] args) {
        int populacaoA = 7000;
        int populacaoB = 20000;
        double taxaCrescimentoA = 0.035;  // 3.5% ao ano
        double taxaCrescimentoB = 0.01;   // 1% ao ano
        int anos = 0;

        // Loop para calcular a quantidade de anos necessária
        while (populacaoA < populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }

        // Exibe o resultado
        System.out.println("Após " + anos + " anos, a população da cidade A será maior ou igual à população da cidade B.");
        System.out.println("População da cidade A: " + populacaoA);
        System.out.println("População da cidade B: " + populacaoB);
    }
}
/* CrescimentoPopulacional */