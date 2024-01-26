/* Crie uma função recursiva potencia(base,expoente) que, quando chamado, retorna baseexpoente.
Por exemplo, potencia(3,4) deve ser implementado como 3 * 3 * 3 * 3. (A saída é apenas
81 nesse exemplo)
Assuma que expoente é um inteiro maior ou igual a 1. */

public class Questao18 {
    
}
/* funcao potencia(base, expoente):
    // Caso base: quando o expoente é 1, retorna a base
    se expoente == 1 entao
        retorne base
    
    // Caso recursivo: chama a função recursivamente com expoente - 1
    retorne base * potencia(base, expoente - 1)

// Exemplo de chamada da função
inteiro resultado = potencia(3, 4)
escreva("O resultado é: ", resultado)
 */