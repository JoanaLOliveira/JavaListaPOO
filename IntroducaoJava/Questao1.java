/* Escreva um programa que calcule a área de um quadrado. O valor do lado de um quadrado
deverá ser informado pelo usuário. */

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        float lado, area;
        Scanner ent = new Scanner(System.in);
        System.out.println("Informe o valor do lado do quadrado: ");
        lado=ent.nextFloat();
        area=lado*lado;
        System.out.println("A area do quadrado é: "+area);
        ent.close();
    }
}
