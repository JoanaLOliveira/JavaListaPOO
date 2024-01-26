/* Escreva uma classe Lampada que possui o atributo estadoDaLampada (ligado ou desligado)
e os métodos acende, apaga e mostraEstado (ex.: A lampada esta acesa). Inclua
um método estaLigada que retorne verdadeiro se a lâmpada estiver ligada e falso caso
contrário. Adicione um campo que indique quantas vezes a lâmpada foi acesa. Para
isso, utilize uma instância da classe Contador criada anteriormente e implemente a lógica
necessária para atualizar seu valor. Escreva um aplicativo de teste que demonstre
as capacidades da classe criada. */

package CriacaoDeClasses2.Lampada28;

public class Lampada28 {
    private String estadoDaLampada;
    private Contador contadorAcesa;

    // Construtor
    public Lampada28() {
        this.estadoDaLampada = "desligada";
        this.contadorAcesa = new Contador();
    }

    // Método para acender a lâmpada
    public void acende() {
        this.estadoDaLampada = "ligada";
        this.contadorAcesa.incrementa();
    }

    // Método para apagar a lâmpada
    public void apaga() {
        this.estadoDaLampada = "desligada";
    }

    // Método para mostrar o estado da lâmpada
    public void mostraEstado() {
        System.out.println("A lâmpada está " + estadoDaLampada);
    }

    // Método que retorna verdadeiro se a lâmpada estiver ligada e falso caso contrário
    public boolean estaLigada() {
        return estadoDaLampada.equals("ligada");
    }

    // Método que retorna o número de vezes que a lâmpada foi acesa
    public int getNumeroVezesAcesa() {
        return contadorAcesa.getValor();
    }
}
