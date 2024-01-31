package UNIDADE1.IntroducaoJava;
/* Escreva um programa para imprimir uma versão aproximada de um cartão da Mega-Sena
(somente com os números, respeitando o número de linhas e a distribuição dos números
nas linhas). */

import java.util.Random;

public class MegaSenaCartao13 {
    public static void main(String[] args) {
        // Imprime o cabeçalho
        System.out.println("=== Cartão da Mega-Sena ===");

        // Gera e imprime os números aleatórios
        for (int i = 1; i <= 6; i++) {
            System.out.print("Linha " + i + ": ");
            imprimirNumerosAleatorios();
        }
    }

    // Função para imprimir seis números aleatórios
    private static void imprimirNumerosAleatorios() {
        Random random = new Random();
        for (int i = 1; i <= 6; i++) {
            int numero = random.nextInt(60) + 1;
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
/* MegaSenaCartao */