/* Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,
Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma
variável de tipo inteiro. Por fim, reescreva o número no formato UCD. Exemplo: 123 deve
ser reescrito como 312. */

import java.util.Scanner;

public class NumeroCDUucd5 {
    public static void main(String[] args) {
        int numero,centena,dezena,unidade,novo_numero;
        Scanner ent = new Scanner(System.in);
        System.out.println("Informe um número de 3 dígitos(CDU): ");
        numero=ent.nextInt();
        centena=numero/100;
        dezena=(numero%100)/10;
        unidade=numero%10;
        novo_numero=(unidade*100)+(dezena*10)+centena;
        System.out.println("Numero no formato UCD: "+novo_numero);
        ent.close();
    }
}
