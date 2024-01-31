/* 
Escreva uma classe genérica com 3 atributos de um mesmo tipo genérico. Além do
construtor, essa classe deve ter:
• Um método que diz quantos dos 3 atributos são iguais;
• Um método que imprime os 3 atributos.
Escreva também uma classe executável para demonstrar o uso da classe criada com
diferente tipos de dados.
 */

package UNIDADE1.CriacaoDeClasses2.TesteTresAtributos32;

public class TesteTresAtributos32 <T> {
    private T atributo1;
    private T atributo2;
    private T atributo3;

    // Construtor
    public TesteTresAtributos32(T atributo1, T atributo2, T atributo3) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    // Método que retorna a quantidade de atributos iguais
    public int contarAtributosIguais() {
        int quantidadeIguais = 0;

        if (atributo1.equals(atributo2)) {
            quantidadeIguais++;
        }

        if (atributo1.equals(atributo3)) {
            quantidadeIguais++;
        }

        if (atributo2.equals(atributo3)) {
            quantidadeIguais++;
        }

        return quantidadeIguais;
    }

    // Método que imprime os 3 atributos
    public void imprimirAtributos() {
        System.out.println("Atributo 1: " + atributo1);
        System.out.println("Atributo 2: " + atributo2);
        System.out.println("Atributo 3: " + atributo3);
    }
}
