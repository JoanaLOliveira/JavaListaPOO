package UNIDADE1.IntroducaoJava;
/* Escreva uma função que calcule o fatorial de forma recursiva. Para cada chamada recursiva,
exiba as saídas em uma linha separada e adicione um nível de recuo (tabulação).
Faça o melhor que você puder para tornar a saída limpa, interessante e significativa. Seu
objetivo aqui é projetar e implementar um formato de saída que facilite o entendimento
da recursão.
3
Por exemplo, para uma entrada n = 5, o programa deve exibir:
0! = 1
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120 */

import java.util.Scanner;

public class FatorialRecursivo19 {
    // Função recursiva para calcular o fatorial e exibir o processo
    public static int calcularFatorial(int n, int nivelRecursao) {
        if (n == 0 || n == 1) {
            System.out.println(representacaoRecursao(nivelRecursao) + n + "! = 1");
            return 1;
        } else {
            int resultado = n * calcularFatorial(n - 1, nivelRecursao + 1);
            System.out.println(representacaoRecursao(nivelRecursao) + n + "! = " + resultado);
            return resultado;
        }
    }

    // Função para criar a representação visual do nível de recursão
    private static String representacaoRecursao(int nivel) {
        StringBuilder tabs = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            tabs.append("\t");
        }
        return tabs.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número para calcular o fatorial
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Calcula e exibe o fatorial do número
        int resultado = calcularFatorial(numero, 0);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}

/* FatorialRecursivo */