package UNIDADE1.IntroducaoJava;
/* Crie uma função recursiva potencia(base,expoente) que, quando chamado, retorna baseexpoente.
Por exemplo, potencia(3,4) deve ser implementado como 3 * 3 * 3 * 3. (A saída é apenas
81 nesse exemplo)
Assuma que expoente é um inteiro maior ou igual a 1. */

import java.util.Scanner;

public class PotenciaRecursiva18 {
    // Função recursiva para calcular a potência
    public static int potencia(int base, int expoente) {
        if (expoente == 1) {
            return base;
        } else {
            return base * potencia(base, expoente - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a base e o expoente
        System.out.print("Digite a base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente (inteiro maior ou igual a 1): ");
        int expoente = scanner.nextInt();

        // Calcula e exibe a potência
        int resultado = potencia(base, expoente);
        System.out.println("O resultado de " + base + "^" + expoente + " é: " + resultado);
    }
}
/* PotenciaRecursiva */