package UNIDADE1.CriacaoDeClasses1.TimeEsportivo23;

import java.util.Scanner;

public class DemoTimeEsportivo23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do time: ");
        String nomeTime = scanner.nextLine();

        System.out.print("Digite a cidade do time: ");
        String cidadeTime = scanner.nextLine();

        System.out.print("Digite a pontuação do time: ");
        int pontuacaoTime = scanner.nextInt();

        // Criando uma instância da classe Time
        TimeEsportivo23 time = new TimeEsportivo23(nomeTime, cidadeTime, pontuacaoTime);

        // Exibindo as informações do time
        System.out.println("\nDetalhes do Time:");
        time.exibirInformacoes();

        scanner.close();
    }
}
