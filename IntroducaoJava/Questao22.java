/* Dado um polinômio
Pn(x) = a0xn + a1xn−1 + · · · + an−1x + an (1)
este pode ser definido recursivamente como
Pn(x) = xPn−1(x) + an (2)
Escreva uma função recursiva para calcular Pn(x). Os parâmetros n, a0, · · · , an e o valor
x devem ser solicitados ao usuário na função main. */

public class Questao22 {
    
}
/* funcao calcularPn(n, coeficientes, x):
    // Caso base: se n é 0, o valor do polinômio é o último coeficiente an
    se n == 0 entao
        retorne coeficientes[0]
    
    // Caso recursivo: calcula x * Pn-1(x) + an
    retorne x * calcularPn(n - 1, coeficientes, x) + coeficientes[n]

// Funcao principal
funcao main():
    inteiro n
    escreva("Informe o grau do polinômio (n): ")
    leia(n)

    // Inicializa um array para armazenar os coeficientes a0, a1, ..., an
    real coeficientes[n+1]

    // Solicita os coeficientes ao usuário
    para i de 0 ate n faca
        escreva("Informe o coeficiente a", i, ": ")
        leia(coeficientes[i])
    fim para

    real x
    escreva("Informe o valor de x: ")
    leia(x)

    // Chama a função para calcular Pn(x)
    real resultado = calcularPn(n, coeficientes, x)

    // Exibe o resultado
    escreva("O valor de Pn(", x, ") é: ", resultado)

// Chamada da função principal
main()
 */