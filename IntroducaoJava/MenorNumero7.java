/* Escreva um programa que lê três números e determina qual número é o menor. */

import java.util.Scanner;

public class MenorNumero7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário os três números
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        // Determina e exibe o menor número
        double menorNumero = encontrarMenor(numero1, numero2, numero3);
        System.out.println("O menor número é: " + menorNumero);
    }

    // Função para encontrar o menor número entre três valores
    private static double encontrarMenor(double num1, double num2, double num3) {
        double menor = num1;

        if (num2 < menor) {
            menor = num2;
        }

        if (num3 < menor) {
            menor = num3;
        }

        return menor;
    }
}

/* MenorNumero */