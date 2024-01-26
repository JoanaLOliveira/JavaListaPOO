/* Escreva um programa que receba um ângulo em graus e o converta para sua representação
em radianos. Divulgue também seno, cosseno, tangente, cossecante, secante e
cotangente do ângulo. */

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        float angulo_graus;
        double seno, cosseno,tangente,cossecante,secante,cotangente,angulo_radianos;
        final double PI = 3.14159265358979323846;
        Scanner ent = new Scanner(System.in);
        System.out.println("Informe o ângulo em graus: ");
        angulo_graus=ent.nextFloat();
        angulo_radianos=angulo_graus*(Math.PI/180);
        seno=Math.sin(angulo_radianos);
        cosseno=Math.cos(angulo_radianos);
        tangente=Math.tan(angulo_radianos);
        if (cosseno!=0) {
            cossecante=1/cosseno;
            secante=1/seno;
            cotangente=1/tangente;
            System.out.println("Ângulo em radianos: "+angulo_radianos);
            System.out.println("Seno: "+seno);
            System.out.println("Cosseno: "+cosseno);
            System.out.println("Tangente: "+tangente);
            System.out.println("Cossecante: "+cossecante);
            System.out.println("Secante: "+secante);
            System.out.println("Cotangente: "+cotangente);
        } else {
            System.out.println("Ângulo em radianos: "+angulo_radianos);
            System.out.println("Seno: "+seno);
            System.out.println("Cosseno: "+cosseno);
            System.out.println("Tangente: "+tangente);
            System.out.println("O Cosseno é zero, não é possíve calcular cossecante, secante e cotangente.");
        }
        ent.close();
    }
}
