/* Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em
dois setores:

* No setor de Eletros, que possui código 222, todas as peças que custam mais de R$
500 vão ter 10% de desconto.
* No setor de Cama, mesa e banho, que possui código 111, peças com valor acima
de R$ 100 vão ter 40% de desconto, peças que custam entre R$ 50 e R$ 100 vão ter
20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto.

Escreva um programa que recebe do usuário o código do setor da loja e o valor original de
um produto e imprime na tela o nome do setor e o valor do produto com desconto. Caso
o usuário forneça um código diferente de 111 ou 222, exiba a mensagem Setor Invalido. */

public class Questao8 {
    
}
/* 
// Pseudocódigo para calcular o valor do produto com desconto conforme a promoção

// Declaração de variáveis
inteiro codigo_setor
real valor_original, valor_com_desconto

// Entrada de dados
escreva("Informe o código do setor (111 para Cama, mesa e banho ou 222 para Eletros): ")
leia(codigo_setor)

escreva("Informe o valor original do produto: ")
leia(valor_original)

// Processamento e saída de resultados
se codigo_setor == 222 então
    // Setor de Eletros
    se valor_original > 500 então
        valor_com_desconto = valor_original * 0.9  // 10% de desconto
        escreva("Setor: Eletros")
        escreva("Valor com desconto: R$", valor_com_desconto)
    senão
        escreva("Setor: Eletros")
        escreva("Sem desconto. Valor original: R$", valor_original)
senão se codigo_setor == 111 então
    // Setor de Cama, mesa e banho
    se valor_original > 100 então
        valor_com_desconto = valor_original * 0.6  // 40% de desconto
    senão se valor_original >= 50 então
        valor_com_desconto = valor_original * 0.8  // 20% de desconto
    senão
        valor_com_desconto = valor_original * 0.9  // 10% de desconto
    escreva("Setor: Cama, mesa e banho")
    escreva("Valor com desconto: R$", valor_com_desconto)
senão
    // Código de setor inválido
    escreva("Setor Inválido")


 */