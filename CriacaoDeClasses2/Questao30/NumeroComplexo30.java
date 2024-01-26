/* Escreva uma classe que contenha métodos estáticos para retornar o maior de dois, três,
quatro e cinco valores, considerando que os argumentos e o retorno dos métodos podem
ser dos tipos int e double. Em outra classe, escreva um aplicativo de teste que, sem criar
objetos, demonstre as capacidades da classe criada. */

package CriacaoDeClasses2.Questao30;

public class NumeroComplexo30 {
    
}
/* classe NumeroComplexo:
    // Atributos privados
    privado real parteReal
    privado real parteImaginaria

    // Método construtor com dois argumentos (parte real e parte imaginária)
    funcao __init__(real parteReal, real parteImaginaria):
        this.parteReal = parteReal
        this.parteImaginaria = parteImaginaria

    // Método construtor com um argumento (somente parte real)
    funcao __init__(real parteReal):
        // Chama o construtor com dois argumentos, considerando parte imaginária como zero
        this.__init__(parteReal, 0)

    // Método construtor sem argumentos (parte real e parte imaginária iguais a zero)
    funcao __init__():
        // Chama o construtor com dois argumentos, considerando ambos como zero
        this.__init__(0, 0)

    // Método para representar o número complexo em notação apropriada
    funcao toString():
        // Constrói a string com a notação apropriada
        retorne this.parteReal + " + " + this.parteImaginaria + "i"
 */