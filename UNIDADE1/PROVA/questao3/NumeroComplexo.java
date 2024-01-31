package UNIDADE1.PROVA.questao3;

public class NumeroComplexo {
    private double parteReal;
    private double parteImaginaria;

    NumeroComplexo(double r, double i){
        parteReal=r;
        parteImaginaria=i;
    }

    NumeroComplexo(double r){
        parteReal=r;
        parteImaginaria=0;
    }

    NumeroComplexo(){
        parteReal=0.0;
        parteImaginaria=0.0;
    }

    public String toString(){
        return parteImaginaria>=0?(parteReal+" + "+parteImaginaria+"i"):(parteReal+" - "+Math.abs(parteImaginaria)+"i");
    }
}
