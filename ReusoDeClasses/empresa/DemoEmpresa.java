package ReusoDeClasses.empresa;

public class DemoEmpresa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Carla", "123218");
        System.out.println(p);
        Funcionario f = new Funcionario("Marcos", "1871987", 3500.45);
        System.out.println(f);
        ChefeDepartamento c = new ChefeDepartamento("Alex", "189866", 13000, "DETEC");
        System.out.println(c);
    }
}
