/* Escreva um programa que receba uma temperatura em graus centígrados e a apresente
em graus Fahrenheit. */

import java.util.Scanner;

public class CelsiusFahrenheit4 {
    public static void main(String[] args) {
        float celsius, fahrenheit;
        Scanner ent = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Celsius: ");
        celsius=ent.nextFloat();
        fahrenheit=(celsius*(9/5)+32);
        System.out.println("Temperatura em graus Fahrenheit: "+fahrenheit);
        ent.close();
    }
}
