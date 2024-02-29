package ReusoDeClasses.empresa;

public class ChefeDepartamento {
    private String departamento;

    public ChefeDepartamento(String nome, String id, double salario, String departamento) {
        super(nome, id, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    // @Override
    // public String toString() {
    //     // return super.toString() + ", departamento=" + departamento;
    //     return "nome=" + getNome() + ", departamento=" + departamento;
    // }
}
