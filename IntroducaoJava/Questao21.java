/* Crie uma função recursiva que verifique se um dado número é primo. */

public class Questao21 {
    
}
/* funcao ehPrimo(numero, divisor):
    // Caso base 1: se o número for igual a 1, não é primo
    se numero == 1 entao
        retorne falso
    
    // Caso base 2: se o divisor for igual ao próprio número, é primo
    se divisor == numero entao
        retorne verdadeiro
    
    // Caso base 3: se o número for divisível por algum divisor além de 1 e ele mesmo, não é primo
    se numero % divisor == 0 entao
        retorne falso
    
    // Caso recursivo: chama a função com um divisor maior
    retorne ehPrimo(numero, divisor + 1)

// Função auxiliar para iniciar a verificação
funcao verificarPrimalidade(numero):
    // Chama a função recursiva começando com divisor 2
    retorne ehPrimo(numero, 2)

// Exemplo de uso
inteiro numero = 17
se verificarPrimalidade(numero) entao
    escreva(numero, " é primo.")
senao
    escreva(numero, " não é primo.")
 */