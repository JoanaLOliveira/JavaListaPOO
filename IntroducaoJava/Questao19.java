/* Escreva uma função que calcule o fatorial de forma recursiva. Para cada chamada recursiva,
exiba as saídas em uma linha separada e adicione um nível de recuo (tabulação).
Faça o melhor que você puder para tornar a saída limpa, interessante e significativa. Seu
objetivo aqui é projetar e implementar um formato de saída que facilite o entendimento
da recursão.
3
Por exemplo, para uma entrada n = 5, o programa deve exibir:
0! = 1
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120 */

public class Questao19 {
    
}

/* funcao calcularFatorial(n, nivelRecursao):
    // Caso base: fatorial de 0 é sempre 1
    se n == 0 entao
        escreva(nivelRecursao, "!", " = 1")
        retorne 1
    senao
        // Cálculo recursivo do fatorial
        fatorialParcial = n * calcularFatorial(n - 1, nivelRecursao + 1)
        
        // Exibição formatada
        escreva(tabulacao(nivelRecursao), n, "!", " = ", fatorialParcial)
        
        retorne fatorialParcial

// Função auxiliar para gerar a tabulação
funcao tabulacao(nivel):
    tabulacao = ""
    para i de 0 ate nivel faca
        tabulacao = tabulacao + "\t"
    fim para
    retorne tabulacao

// Chamada inicial da função com n = 5
calcularFatorial(5, 0)
 */