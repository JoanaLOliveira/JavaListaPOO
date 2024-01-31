package UNIDADE1.PROVA.questao4;

public class DemoElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(8, 4);
        elevador.sai();
        elevador.desce();
        elevador.entra();
        elevador.sobe();
    }
}
