package INTRODUCAO;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        double x1,y1,x2,y2,dist;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("x1: ");
        x1 = entrada.nextDouble();
        System.out.println("y1: ");
        y1 = entrada.nextDouble();
        System.out.println("x2: ");
        x2 = entrada.nextDouble();
        System.out.println("y2: ");
        y2 = entrada.nextDouble();

        dist = Math.sqrt(Math.pow(x2-x1, 2.0)+Math.pow(y2-y1, 2.0));

        System.out.println("A distancia eh: "+dist);

        entrada.close();
    }
}
