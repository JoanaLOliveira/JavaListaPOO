package UNIDADE1.IntroducaoJava;
/* Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e
informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro. */

import java.util.Scanner;

public class PosicaoPontos11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das coordenadas do primeiro ponto
        System.out.println("Informe as coordenadas do primeiro ponto:");
        System.out.print("Coordenada x do primeiro ponto: ");
        double x1 = scanner.nextDouble();
        System.out.print("Coordenada y do primeiro ponto: ");
        double y1 = scanner.nextDouble();

        // Leitura das coordenadas do segundo ponto
        System.out.println("\nInforme as coordenadas do segundo ponto:");
        System.out.print("Coordenada x do segundo ponto: ");
        double x2 = scanner.nextDouble();
        System.out.print("Coordenada y do segundo ponto: ");
        double y2 = scanner.nextDouble();

        // Verificação da relação de posição
        verificarPosicao(x1, y1, x2, y2);
    }

    // Função para verificar a relação de posição entre os dois pontos
    private static void verificarPosicao(double x1, double y1, double x2, double y2) {
        if (x1 == x2 && y1 == y2) {
            System.out.println("Os pontos estão no mesmo local.");
        } else {
            // Verifica se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro
            if (y2 > y1) {
                System.out.println("O segundo ponto está acima do primeiro.");
            } else if (y2 < y1) {
                System.out.println("O segundo ponto está abaixo do primeiro.");
            }

            if (x2 > x1) {
                System.out.println("O segundo ponto está à direita do primeiro.");
            } else if (x2 < x1) {
                System.out.println("O segundo ponto está à esquerda do primeiro.");
            }
        }
    }
}
/* PosicaoPontos */