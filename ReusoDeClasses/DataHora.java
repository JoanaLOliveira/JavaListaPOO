package ReusoDeClasses;

public class DataHora {
    private Data estaData;
    private Hora estaHora;

    DataHora(int hora, int minuto, int segundo, int dia, int mes, short ano){
        estaData=new Data(dia,mes,ano);
        estaHora=new Hora(hora,minuto,segundo);
    }

    DataHora(int dia, int mes, short ano){
        estaData=new Data(dia,mes,ano);
        estaHora=new Hora(0,0,0);
    }

    public String toString(){
        return estaData+" "+estaHora;
    }
}
