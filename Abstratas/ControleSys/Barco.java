package Abstratas.ControleSys;

public class Barco extends Aquatico {
    private String cadBarco;

    public Barco(int capacidade, double profundidade, String cadBarco) {
        super(capacidade, profundidade);
        this.cadBarco = cadBarco;
    }
    
    public void moverFrente() {
        System.out.println("Barco movendo para frente");
    }
}
