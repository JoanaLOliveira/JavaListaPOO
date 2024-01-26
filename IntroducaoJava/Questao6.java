/* Escreva um programa que recebe um valor inteiro representando um intervalo em minutos
e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e
minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos. */

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        int total_minutos,dias,horas,minutos;
        Scanner ent = new Scanner(System.in);
        System.out.println("Informe o intervalo em minutos: ");
        total_minutos=ent.nextInt();
        dias=total_minutos/1440;
        horas=(total_minutos%1440)/60;
        minutos=total_minutos%60;
        System.out.println("o intervalo de "+total_minutos+" minutos é equivalente a "+dias+" dias "+horas+" horas e "+minutos+" minutos");
        ent.close();
        
    }
}
