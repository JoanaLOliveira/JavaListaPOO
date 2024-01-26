/* Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o número do andar atual, o total de
andares no prédio, a capacidade do elevador e quantas pessoas estão presentes nele.
Outras classes não devem ter acesso direto aos atributos de Elevador. A classe deve
também disponibilizar os seguintes métodos:
• construtor : que deve receber como parâmetros a capacidade do elevador e o total
de andares no prédio (um elevador sempre começa no térreo e vazio);
• entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
houver espaço);
• sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
• sobe : para subir um andar (não deve subir se já estiver no último andar);
• desce : para descer um andar (não deve descer se já estiver no térreo).
Escreva um aplicativo de teste que demonstre as capacidades da classe criada, ou seja,
execute todos os métodos da classe. */

package CriacaoDeClasses2.Questao26;

public class Elevador26 {
    
    
}

/* classe Elevador:
    // Atributos privados
    privado inteiro andarAtual
    privado inteiro totalAndares
    privado inteiro capacidade
    privado inteiro pessoasPresentes

    // Método construtor
    funcao __init__(capacidade, totalAndares):
        // Inicializa os atributos da classe
        this.andarAtual = 0  // Começa no térreo
        this.totalAndares = totalAndares
        this.capacidade = capacidade
        this.pessoasPresentes = 0

    // Método para adicionar uma pessoa no elevador
    funcao entra():
        // Verifica se há espaço para mais uma pessoa
        se this.pessoasPresentes < this.capacidade entao
            this.pessoasPresentes = this.pessoasPresentes + 1

    // Método para remover uma pessoa do elevador
    funcao sai():
        // Verifica se há alguém para remover
        se this.pessoasPresentes > 0 entao
            this.pessoasPresentes = this.pessoasPresentes - 1

    // Método para subir um andar
    funcao sobe():
        // Verifica se já está no último andar
        se this.andarAtual < this.totalAndares - 1 entao
            this.andarAtual = this.andarAtual + 1

    // Método para descer um andar
    funcao desce():
        // Verifica se já está no térreo
        se this.andarAtual > 0 entao
            this.andarAtual = this.andarAtual - 1

    // Métodos de acesso para obter informações sobre o elevador
    funcao obterAndarAtual():
        retorne this.andarAtual

    funcao obterPessoasPresentes():
        retorne this.pessoasPresentes

    funcao obterCapacidade():
        retorne this.capacidade
 */