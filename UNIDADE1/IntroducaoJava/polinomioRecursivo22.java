package UNIDADE1.IntroducaoJava;
/* Dado um polinômio
Pn(x) = a0xn + a1xn−1 + · · · + an−1x + an (1)
este pode ser definido recursivamente como
Pn(x) = xPn−1(x) + an (2)
Escreva uma função recursiva para calcular Pn(x). Os parâmetros n, a0, · · · , an e o valor
x devem ser solicitados ao usuário na função main. */

import java.util.Scanner;

public class polinomioRecursivo22 {
    // Função recursiva para calcular Pn(x)
    public static double calcularPolinomio(int n, double[] coeficientes, double x) {
        if (n == 0) {
            return coeficientes[0];
        } else {
            return x * calcularPolinomio(n - 1, coeficientes, x) + coeficientes[n];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o grau do polinômio
        System.out.print("Digite o grau do polinômio (n): ");
        int n = scanner.nextInt();

        // Solicita ao usuário os coeficientes do polinômio
        double[] coeficientes = new double[n + 1];
        for (int i = 0; i <= n; i++) {
            System.out.print("Digite o coeficiente a" + i + ": ");
            coeficientes[i] = scanner.nextDouble();
        }

        // Solicita ao usuário o valor de x
        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();

        // Calcula e exibe o resultado
        double resultado = calcularPolinomio(n, coeficientes, x);
        System.out.println("O resultado do polinômio Pn(x) é: " + resultado);
    }
}

/* polinomioRecursivo */