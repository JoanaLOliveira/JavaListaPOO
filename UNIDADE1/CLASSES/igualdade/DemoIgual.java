package CLASSES.igualdade;

public class DemoIgual {
    public static void main(String[] args) {
        Double d1=5.0;
        Double d2=5.0;
        System.out.println("d1==d2 ?"+(Igualdade.ehIgual(d1,d2)? "sim":"nao"));
        int i1=4;
        int i2=3;
        System.out.println("d1==d2 ?"+(Igualdade.ehIgual(i1,i2)? "sim":"nao"));
    }
}
