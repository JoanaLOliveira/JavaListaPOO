package UNIDADE1.IntroducaoJava;
/* Crie uma função recursiva mdc que retorna o máximo divisor comum de m e n. O mdc de
m e n é definido recursivamente como segue:
• se n > m, retorne mdc(n,m);
• se n = 0, retorne m;
• senão, retorne mdc(n,m%n), onde % é o operador de resto da divisão. */

import java.util.Scanner;

public class MdcRecursivo20 {
    // Função recursiva para calcular o MDC de m e n
    public static int mdc(int m, int n) {
        if (n > m) {
            return mdc(n, m);
        } else if (n == 0) {
            return m;
        } else {
            return mdc(n, m % n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário dois números para calcular o MDC
        System.out.print("Digite o primeiro número (m): ");
        int m = scanner.nextInt();

        System.out.print("Digite o segundo número (n): ");
        int n = scanner.nextInt();

        // Calcula e exibe o MDC dos dois números
        int resultado = mdc(m, n);
        System.out.println("O MDC de " + m + " e " + n + " é: " + resultado);
    }
}
/* mdcRecursivo */