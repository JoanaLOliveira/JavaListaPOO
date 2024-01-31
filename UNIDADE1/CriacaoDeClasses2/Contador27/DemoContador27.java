package UNIDADE1.CriacaoDeClasses2.Contador27;

public class DemoContador27 {
    // Aplicativo de teste
    public static void main(String[] args) {
        // Criando uma instância da classe Contador
        Contador27 contador = new Contador27();

        // Testando os métodos
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();

        System.out.println("Valor atual do contador: " + contador.obterValor());

        contador.zerar();
        System.out.println("Valor atual do contador após zerar: " + contador.obterValor());
    }
}
