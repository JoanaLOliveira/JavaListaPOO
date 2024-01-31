package UNIDADE1.PROVA.questao2;

public class Aluno {
    private String nome;
    private String matricula;
    private double p1;
    private double p2;
    private double t;

    public Aluno(String nome, String matricula, double p1, double p2, double t){
        this.nome=nome;
        this.matricula=matricula;
        this.p1=p1;
        this.p2=p2;
        this.t=t;
    }
    public double media(){
        return (2.5*p1+2.5*p2+2*t)/7;
    }

    public double provaFinal(){
        double mp = this.media();
        if (mp<3||mp>=7) {
            return 0;
        }
        return (50-6*mp)/4;
    }
}
