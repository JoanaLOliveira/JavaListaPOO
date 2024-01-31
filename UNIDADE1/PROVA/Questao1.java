package UNIDADE1.PROVA;

import java.util.Scanner;

/**
 * Questao1
 */
public class Questao1 {
    public static void main(String[] args) {
        int codigo;
        double valor;
        String setor;
        Scanner sc = new Scanner(System.in);
        System.out.print("Codigo do setor: ");
        codigo=sc.nextInt();
        System.out.println("Valor do produto: ");
        valor = sc.nextDouble();
        sc.close();
        switch (codigo) {
            case 111:
                setor="Cama, Mesa e Banho";
                if (valor>100) {
                    valor*=0.6;
                } else if (valor>=50){
                    valor*=0.8;
                } else{
                    valor*=0.9;
                }
                break;
            case 222:
                setor="Eletros";
                if (valor>500) valor *= 0.9;
                break;
            default:
                System.out.println("Setor invalido");
                return;
        }
        System.out.println("Setor: "+setor);
        System.out.println("Valor final: "+valor);
    }
}