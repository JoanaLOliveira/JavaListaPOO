/* Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3
valores reais serão informados pelo usuário. */

import java.util.Scanner;

public class SomaMedia2 {
    public static void main(String[] args) {
        float num1,num2,num3;
        float soma,media;
        Scanner ent = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        num1=ent.nextFloat();
        System.out.println("Informe o segundo número: ");
        num2=ent.nextFloat();
        System.out.println("Informe o terceiro número: ");
        num3=ent.nextFloat();
        soma=num1+num2+num3;
        media=soma/3;
        System.out.println("A Soma dos três números é: "+soma);
        System.out.println("A Média aritmética dos três números é: "+media);
        ent.close();
    }
}
