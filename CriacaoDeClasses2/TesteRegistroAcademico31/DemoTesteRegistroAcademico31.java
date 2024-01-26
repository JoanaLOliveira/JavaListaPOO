package CriacaoDeClasses2.TesteRegistroAcademico31;

public class DemoTesteRegistroAcademico31 {
    // Método main para uma aplicação de exemplo
    public static void main(String[] args) {
        // Criando instâncias da classe RegistroAcademico
        TesteRegistroAcademico31 aluno1 = new TesteRegistroAcademico31("Alice", 20);
        TesteRegistroAcademico31 aluno2 = new TesteRegistroAcademico31("Bob", 22);
        TesteRegistroAcademico31 aluno3 = new TesteRegistroAcademico31("Charlie", 21);

        // Exibindo informações dos alunos
        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
        System.out.println(aluno3.toString());
    }
}
