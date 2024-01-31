package UNIDADE1.CriacaoDeClasses2.Elevador26;

import java.util.Scanner;

public class DemoElevador26 {
    // Aplicativo de teste
    public static void main(String[] args) {
        // Criando uma instância da classe Elevador
        Elevador26 elevador = new Elevador26(10, 5);

        // Testando os métodos
        elevador.informacoesElevador();

        elevador.entra();
        elevador.sobe();
        elevador.sobe();
        elevador.entra();
        elevador.informacoesElevador();

        elevador.sobe();
        elevador.sai();
        elevador.sai();
        elevador.informacoesElevador();

        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.informacoesElevador();
    }
}
