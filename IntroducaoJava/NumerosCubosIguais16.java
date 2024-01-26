/* Escreva um programa que determine quais são todos os números de 3 algarismos cuja
soma dos cubos de seus algarismos sejam iguais ao próprio número.
• Exemplo: 153 = 13 + 53 + 33 = 1 + 125 + 27. */

public class NumerosCubosIguais16 {
    public static void main(String[] args) {
        for (int numero = 100; numero <= 999; numero++) {
            if (verificarSomaCubos(numero)) {
                System.out.println(numero + " é um número de 3 algarismos cuja soma dos cubos de seus algarismos é igual ao próprio número.");
            }
        }
    }

    // Função para verificar se a soma dos cubos dos algarismos é igual ao número
    private static boolean verificarSomaCubos(int numero) {
        int original = numero;
        int somaCubos = 0;

        while (numero > 0) {
            int digito = numero % 10;
            somaCubos += Math.pow(digito, 3);
            numero /= 10;
        }

        return somaCubos == original;
    }
}
/* NumerosCubosIguais */