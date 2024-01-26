/* Escreva uma classe Lampada que possui o atributo estadoDaLampada (ligado ou desligado)
e os métodos acende, apaga e mostraEstado (ex.: A lampada esta acesa). Inclua
um método estaLigada que retorne verdadeiro se a lâmpada estiver ligada e falso caso
contrário. Adicione um campo que indique quantas vezes a lâmpada foi acesa. Para
isso, utilize uma instância da classe Contador criada anteriormente e implemente a lógica
necessária para atualizar seu valor. Escreva um aplicativo de teste que demonstre
as capacidades da classe criada. */

package CriacaoDeClasses2.Questao28;

public class Lampada28 {
    
}
/* classe Lampada:
    // Atributos privados
    privado texto estadoDaLampada
    privado Contador contadorAcesa

    // Método construtor
    funcao __init__():
        // Inicializa o estado da lâmpada como desligado
        this.estadoDaLampada = "desligado"
        // Cria uma instância da classe Contador para contabilizar quantas vezes a lâmpada foi acesa
        this.contadorAcesa = Contador()

    // Método para acender a lâmpada
    funcao acende():
        this.estadoDaLampada = "ligado"
        // Incrementa o contador de vezes que a lâmpada foi acesa
        this.contadorAcesa.incrementar()

    // Método para apagar a lâmpada
    funcao apaga():
        this.estadoDaLampada = "desligado"

    // Método para mostrar o estado da lâmpada
    funcao mostraEstado():
        escreva("A lâmpada está", this.estadoDaLampada)

    // Método para verificar se a lâmpada está ligada
    funcao estaLigada():
        // Retorna verdadeiro se o estado for "ligado", falso caso contrário
        retorne this.estadoDaLampada == "ligado"

    // Método para obter a quantidade de vezes que a lâmpada foi acesa
    funcao obterQuantidadeAcesa():
        // Retorna o valor do contador
        retorne this.contadorAcesa.obterValor()
 */