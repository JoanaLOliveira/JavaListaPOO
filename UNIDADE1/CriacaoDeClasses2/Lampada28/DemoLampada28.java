package UNIDADE1.CriacaoDeClasses2.Lampada28;

public class DemoLampada28 {
    // Aplicativo de teste
    public static void main(String[] args) {
        // Criando uma instância da classe Lampada
        Lampada28 minhaLampada = new Lampada28();

        // Testando os métodos
        minhaLampada.mostraEstado(); // Deve imprimir "A lâmpada está desligada"

        minhaLampada.acende();
        minhaLampada.mostraEstado(); // Deve imprimir "A lâmpada está ligada"
        System.out.println("Número de vezes que a lâmpada foi acesa: " + minhaLampada.getNumeroVezesAcesa()); // Deve imprimir "1"

        minhaLampada.apaga();
        minhaLampada.mostraEstado(); // Deve imprimir "A lâmpada está desligada"

        minhaLampada.acende();
        minhaLampada.mostraEstado(); // Deve imprimir "A lâmpada está ligada"
        System.out.println("Número de vezes que a lâmpada foi acesa: " + minhaLampada.getNumeroVezesAcesa()); // Deve imprimir "2"
    }
}
