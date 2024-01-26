/* Escreva um programa que escreve os 4 primeiros números perfeitos. Um número perfeito
é aquele que é igual à soma dos seus divisores (exceto o próprio número). Exemplos:
6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14. */

public class Questao15 {
    
}
/* // Pseudocódigo para encontrar os 4 primeiros números perfeitos

// Função para verificar se um número é perfeito
funcao ehPerfeito(numero: inteiro) : logico
    inteiro somaDivisores
    somaDivisores = 1  // 1 é sempre um divisor
    
    // Loop para encontrar e somar os divisores do número
    para i de 2 ate numero/2 faca
        se numero % i == 0 entao
            somaDivisores = somaDivisores + i
        fim se
    fim para
    
    // Retorna verdadeiro se a soma dos divisores é igual ao número
    retorne somaDivisores == numero

// Função para encontrar e imprimir os 4 primeiros números perfeitos
funcao encontrarQuatroPerfeitos()
    inteiro contador = 0
    inteiro numero = 2  // Inicia a busca a partir do número 2
    
    enquanto contador < 4 faca
        se ehPerfeito(numero) entao
            escreva(numero, " é um número perfeito.")
            contador = contador + 1
        fim se
        numero = numero + 1
    fim enquanto

// Chamada da função para encontrar e imprimir os 4 primeiros números perfeitos
encontrarQuatroPerfeitos()
 */