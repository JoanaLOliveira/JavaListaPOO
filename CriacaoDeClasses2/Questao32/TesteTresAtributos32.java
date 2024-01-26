/* 
Escreva uma classe genérica com 3 atributos de um mesmo tipo genérico. Além do
construtor, essa classe deve ter:
• Um método que diz quantos dos 3 atributos são iguais;
• Um método que imprime os 3 atributos.
Escreva também uma classe executável para demonstrar o uso da classe criada com
diferente tipos de dados.
 */

package CriacaoDeClasses2.Questao32;

public class TesteTresAtributos32 {
    
}
/* classe TresAtributos[Tipo]:
    // Atributos da classe
    privado Tipo atributo1
    privado Tipo atributo2
    privado Tipo atributo3

    // Método construtor
    funcao __init__(Tipo valor1, Tipo valor2, Tipo valor3):
        this.atributo1 = valor1
        this.atributo2 = valor2
        this.atributo3 = valor3

    // Método para contar quantos dos 3 atributos são iguais
    funcao contarIguais():
        inteiro contadorIguais = 0

        // Compara atributo1 com atributo2
        se this.atributo1 == this.atributo2 entao
            contadorIguais = contadorIguais + 1
        fim se

        // Compara atributo1 com atributo3
        se this.atributo1 == this.atributo3 entao
            contadorIguais = contadorIguais + 1
        fim se

        // Compara atributo2 com atributo3
        se this.atributo2 == this.atributo3 entao
            contadorIguais = contadorIguais + 1
        fim se

        retorne contadorIguais

    // Método para imprimir os 3 atributos
    funcao imprimirAtributos():
        escreva("Atributo 1:", this.atributo1)
        escreva("Atributo 2:", this.atributo2)
        escreva("Atributo 3:", this.atributo3)
 */