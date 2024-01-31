package UNIDADE1.IntroducaoJava;
/* Escreva um programa que apresente a série de Fibonacci até o n-ézimo termo. Assuma
que n > 0. */

import java.util.Scanner;

public class SerieFibonacci14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor de n
        System.out.print("Digite o valor de n (n > 0): ");
        int n = scanner.nextInt();

        // Valida se n é maior que 0
        if (n <= 0) {
            System.out.println("Por favor, digite um valor de n maior que 0.");
            return;
        }

        // Gera e exibe a série de Fibonacci até o n-ésimo termo
        System.out.println("Série de Fibonacci até o " + n + "-ésimo termo:");
        for (int i = 0; i < n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }

    // Função para calcular o termo da série de Fibonacci
    private static int calcularFibonacci(int termo) {
        if (termo == 0) {
            return 0;
        } else if (termo == 1) {
            return 1;
        } else {
            return calcularFibonacci(termo - 1) + calcularFibonacci(termo - 2);
        }
    }
}
/* SerieFibonacci */