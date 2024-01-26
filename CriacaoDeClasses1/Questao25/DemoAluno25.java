package CriacaoDeClasses1.Questao25;

import java.util.Scanner;

public class DemoAluno25 {
    public static void main(String[] args) {

        // Criar instância de aluno
        Aluno25 aluno1 = new Aluno25(123, "João", 7.5f, 6.0f, 8.0f);

        // Exibir informações sobre o aluno
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Média Parcial: " + aluno1.calcularMedia());
        System.out.println("Prova Final: " + aluno1.calcularProvaFinal());
        System.out.println("Aprovado: " + aluno1.verificarAprovacao());

    }
}
