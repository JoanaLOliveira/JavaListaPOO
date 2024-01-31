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

package UNIDADE1.CriacaoDeClasses2.Elevador26;

public class Elevador26 {
    private int andarAtual;
    private final int totalAndares;
    private final int capacidade;
    private int pessoasPresentes;

    // Construtor
    public Elevador26(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;  // Inicia no térreo
        this.pessoasPresentes = 0;
    }

    // Método para acrescentar uma pessoa no elevador
    public void entra() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou no elevador.");
        } else {
            System.out.println("O elevador está cheio. Não é possível entrar mais pessoas.");
        }
    }

    // Método para remover uma pessoa do elevador
    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador.");
        } else {
            System.out.println("O elevador está vazio. Não é possível remover pessoas.");
        }
    }

    // Método para subir um andar
    public void sobe() {
        if (andarAtual < totalAndares - 1) {
            andarAtual++;
            System.out.println("O elevador subiu para o andar " + andarAtual + ".");
        } else {
            System.out.println("O elevador já está no último andar. Não é possível subir mais.");
        }
    }

    // Método para descer um andar
    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("O elevador desceu para o andar " + andarAtual + ".");
        } else {
            System.out.println("O elevador já está no térreo. Não é possível descer mais.");
        }
    }

    // Método para obter informações sobre o estado do elevador
    public void informacoesElevador() {
        System.out.println("Andar Atual: " + andarAtual);
        System.out.println("Pessoas Presentes: " + pessoasPresentes);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Total de Andares: " + totalAndares);
    }
}

