package UNIDADE1.CriacaoDeClasses2.TesteTresAtributos32;

public class DemoTesteTresAtributos32 {
    // Classe executável para demonstrar o uso da classe com diferentes tipos de dados
    public static void main(String[] args) {
        // Exemplo com Strings
        TesteTresAtributos32<String> atributosString = new TesteTresAtributos32<>("A", "B", "A");
        atributosString.imprimirAtributos();
        System.out.println("Quantidade de atributos iguais: " + atributosString.contarAtributosIguais());

        // Exemplo com Inteiros
        TesteTresAtributos32<Integer> atributosInteiros = new TesteTresAtributos32<>(1, 2, 3);
        atributosInteiros.imprimirAtributos();
        System.out.println("Quantidade de atributos iguais: " + atributosInteiros.contarAtributosIguais());

        // Exemplo com Doubles
        TesteTresAtributos32<Double> atributosDoubles = new TesteTresAtributos32<>(1.5, 2.0, 1.5);
        atributosDoubles.imprimirAtributos();
        System.out.println("Quantidade de atributos iguais: " + atributosDoubles.contarAtributosIguais());
    }
}
