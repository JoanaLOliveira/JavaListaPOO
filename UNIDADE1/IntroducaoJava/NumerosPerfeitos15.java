package UNIDADE1.IntroducaoJava;
/* Escreva um programa que escreve os 4 primeiros números perfeitos. Um número perfeito
é aquele que é igual à soma dos seus divisores (exceto o próprio número). Exemplos:
6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14. */

public class NumerosPerfeitos15 {
    public static void main(String[] args) {
        int quantidadePerfeitosEncontrados = 0;
        int numero = 1;

        while (quantidadePerfeitosEncontrados < 4) {
            if (verificarNumeroPerfeito(numero)) {
                System.out.println(numero + " é um número perfeito.");
                quantidadePerfeitosEncontrados++;
            }
            numero++;
        }
    }

    // Função para verificar se um número é perfeito
    private static boolean verificarNumeroPerfeito(int numero) {
        int somaDivisores = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        return somaDivisores == numero;
    }
}
/* NumerosPerfeitos */