/* Crie uma função recursiva mdc que retorna o máximo divisor comum de m e n. O mdc de
m e n é definido recursivamente como segue:
• se n > m, retorne mdc(n,m);
• se n = 0, retorne m;
• senão, retorne mdc(n,m%n), onde % é o operador de resto da divisão. */

public class Questao20 {
    
}

/* funcao mdc(m, n):
    // Caso base 1: se n > m, troca os valores e chama recursivamente
    se n > m entao
        retorne mdc(n, m)
    
    // Caso base 2: se n é zero, o mdc é m
    se n == 0 entao
        retorne m
    
    // Caso recursivo: calcula mdc(n, m % n) recursivamente
    retorne mdc(n, m % n)

// Exemplo de uso
inteiro resultado = mdc(48, 18)
escreva("O MDC é: ", resultado)
 */