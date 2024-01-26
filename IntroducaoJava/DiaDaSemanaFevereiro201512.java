/* O mês de fevereiro de 2015 começou em um domingo. Escreva um programa que, dado
o número de um dia do mês de fevereiro de 2015 (um valor entre 1 e 28), imprime o dia
da semana correspondente.
• Exemplo de entrada: 10
• Exemplo de saída: O dia 10 será uma terça-feira. */

import java.util.Scanner;

public class DiaDaSemanaFevereiro201512 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número do dia de fevereiro de 2015
        System.out.print("Digite o número do dia (1 a 28) de fevereiro de 2015: ");
        int dia = scanner.nextInt();

        // Verifica se o número do dia está no intervalo válido
        if (dia < 1 || dia > 28) {
            System.out.println("Por favor, digite um número válido entre 1 e 28.");
            return;
        }

        // Obtém o dia da semana correspondente e imprime o resultado
        String diaDaSemana = obterDiaDaSemana(dia);
        System.out.println("O dia " + dia + " será um(a) " + diaDaSemana + ".");
    }

    // Função para obter o dia da semana correspondente a um número do dia de fevereiro de 2015
    private static String obterDiaDaSemana(int dia) {
        // O mês de fevereiro de 2015 começou em um domingo, então o dia 1 é domingo
        String[] diasDaSemana = {"domingo", "segunda-feira", "terça-feira", "quarta-feira",
                                  "quinta-feira", "sexta-feira", "sábado"};

        // Calcula o índice do dia da semana
        int indiceDiaDaSemana = (dia + 5) % 7; // Adiciona 5 para compensar que o dia 1 é domingo

        return diasDaSemana[indiceDiaDaSemana];
    }
}

/* DiaDaSemanaFevereiro2015*/