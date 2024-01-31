package UNIDADE1.CriacaoDeClasses1.Fatura24;

import java.util.Scanner;

public class DemoFatura24 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o número de identificação: ");
        String numeroIdentificacao=ent.nextLine();
        System.out.println("Digite a descrição: ");
        String descricao=ent.nextLine();
        System.out.println("Digite a quantidade: ");
        int quantidade=ent.nextInt();
        System.out.println("Digite o preço unitário: ");
        double precoUnitario = ent.nextDouble();
        Fatura24 fatura = new Fatura24(numeroIdentificacao, descricao, quantidade, precoUnitario);

        System.out.println("\nDetalhes da Fatura:");
        System.out.println("Número de Identificação: " + fatura.getNumeroIdentificacao());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço Unitário: " + fatura.getPrecoUnitario());
        System.out.println("Total da Fatura: " + fatura.calculaTotal());

        ent.close();

    }
}

