package UNIDADE1.IntroducaoJava;
/* Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 =
espadas). O programa deve imprimir o nome da carta por extenso. */

import java.util.Scanner;

public class NomeCarta9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do valor da carta
        System.out.print("Digite o valor da carta (1 a 13): ");
        int valorCarta = scanner.nextInt();

        // Leitura do naipe da carta
        System.out.print("Digite o naipe da carta (1 = ouros, 2 = paus, 3 = copas, 4 = espadas): ");
        int naipeCarta = scanner.nextInt();

        // Verificação e impressão do nome da carta por extenso
        if (valorCarta >= 1 && valorCarta <= 13 && naipeCarta >= 1 && naipeCarta <= 4) {
            String nomeValor = obterNomeValorCarta(valorCarta);
            String nomeNaipe = obterNomeNaipeCarta(naipeCarta);

            System.out.println("A carta é: " + nomeValor + " de " + nomeNaipe);
        } else {
            System.out.println("Valores inválidos. Certifique-se de que o valor está entre 1 e 13, e o naipe entre 1 e 4.");
        }
    }

    // Função para obter o nome do valor da carta
    private static String obterNomeValorCarta(int valor) {
        String[] nomes = {"Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"};
        return nomes[valor - 1];
    }

    // Função para obter o nome do naipe da carta
    private static String obterNomeNaipeCarta(int naipe) {
        switch (naipe) {
            case 1:
                return "Ouros";
            case 2:
                return "Paus";
            case 3:
                return "Copas";
            case 4:
                return "Espadas";
            default:
                return "Desconhecido";
        }
    }
}

/* NomeCarta */