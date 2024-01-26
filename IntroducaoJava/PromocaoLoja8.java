/* Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em
dois setores:

* No setor de Eletros, que possui código 222, todas as peças que custam mais de R$
500 vão ter 10% de desconto.
* No setor de Cama, mesa e banho, que possui código 111, peças com valor acima
de R$ 100 vão ter 40% de desconto, peças que custam entre R$ 50 e R$ 100 vão ter
20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto.

Escreva um programa que recebe do usuário o código do setor da loja e o valor original de
um produto e imprime na tela o nome do setor e o valor do produto com desconto. Caso
o usuário forneça um código diferente de 111 ou 222, exiba a mensagem Setor Invalido. */

import java.util.Scanner;

public class PromocaoLoja8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o código do setor
        System.out.print("Digite o código do setor (111 para Cama, mesa e banho, 222 para Eletros): ");
        int codigoSetor = scanner.nextInt();

        // Solicita ao usuário o valor original do produto
        System.out.print("Digite o valor original do produto: R$ ");
        double valorOriginal = scanner.nextDouble();

        // Aplica a promoção de acordo com o código do setor
        if (codigoSetor == 111) {
            aplicarPromocaoCamaMesaBanho(valorOriginal);
        } else if (codigoSetor == 222) {
            aplicarPromocaoEletros(valorOriginal);
        } else {
            System.out.println("Setor Inválido.");
        }
    }

    // Função para aplicar a promoção no setor de Cama, mesa e banho
    private static void aplicarPromocaoCamaMesaBanho(double valorOriginal) {
        if (valorOriginal > 100) {
            // Desconto de 40%
            double valorComDesconto = valorOriginal * 0.6;
            exibirResultado("Cama, mesa e banho", valorComDesconto);
        } else if (valorOriginal >= 50 && valorOriginal <= 100) {
            // Desconto de 20%
            double valorComDesconto = valorOriginal * 0.8;
            exibirResultado("Cama, mesa e banho", valorComDesconto);
        } else {
            // Desconto de 10%
            double valorComDesconto = valorOriginal * 0.9;
            exibirResultado("Cama, mesa e banho", valorComDesconto);
        }
    }

    // Função para aplicar a promoção no setor de Eletros
    private static void aplicarPromocaoEletros(double valorOriginal) {
        if (valorOriginal > 500) {
            // Desconto de 10%
            double valorComDesconto = valorOriginal * 0.9;
            exibirResultado("Eletros", valorComDesconto);
        } else {
            // Sem desconto
            exibirResultado("Eletros", valorOriginal);
        }
    }

    // Função para exibir o resultado final
    private static void exibirResultado(String setor, double valorComDesconto) {
        System.out.println("Setor: " + setor);
        System.out.println("Valor com desconto: R$ " + valorComDesconto);
    }
}
/*PromocaoLoja */