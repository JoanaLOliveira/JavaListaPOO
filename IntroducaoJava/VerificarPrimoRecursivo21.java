/* Crie uma função recursiva que verifique se um dado número é primo. */

import java.util.Scanner;

public class VerificarPrimoRecursivo21 {
    // Função recursiva para verificar se um número é primo
    public static boolean ehPrimo(int numero, int divisor) {
        if (divisor == 1) {
            return true;  // Se o divisor atingir 1, o número é primo
        } else {
            if (numero % divisor == 0) {
                return false;  // Se o número for divisível por algum divisor, não é primo
            } else {
                return ehPrimo(numero, divisor - 1);  // Chama recursivamente com o próximo divisor
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número para verificar se é primo
        System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();

        // Verifica se o número é primo e exibe o resultado
        boolean resultado = ehPrimo(numero, numero / 2);  // Começa a verificação com o maior divisor possível
        if (resultado) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}


/* VerificarPrimoRecursivo */