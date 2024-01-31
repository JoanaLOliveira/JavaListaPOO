package UNIDADE1.PROVA.questao4;

public class Elevador {
    private int qtdPessoas;
    private int capacidade;
    private int andar;
    private int totalAndares;
    
    public Elevador (int capacidade, int totalAndares){
        this.qtdPessoas=0;
        this.capacidade=capacidade;
        this.andar=0;
        this.totalAndares=totalAndares;
    }

    public void entra(){
        if (qtdPessoas<capacidade) {
            qtdPessoas++;
            System.out.println("Entrou uma pessoa no elevador");
        }else{
            System.out.println("Elevador cheio!!");
        }
    }

    public void sai(){
        if(qtdPessoas>0){
            qtdPessoas--;
            System.out.println("Saiu uma pessoa no elevador");
        }else{
            System.out.println("Elevador vazio!!");
        }
    }

    public void sobe(){
        if (andar<totalAndares) {
            andar++;
            System.out.println("elevador subiu 1 andar");
        }else{
            System.out.println("Elevador ja esta no ultimo andar!!");
        }
    }

    public void desce(){
        if(andar>0){
            andar--;
            System.out.println("elevador desceu 1 andar");
        }else{
            System.out.println("Elevador ja esta no terreo!!");
        }
    }
}
