package empresa;

public abstract class Funcionario {

    String nome;
    double salario;
    int id;

    public Funcionario(String nome, double salario, int id) {
        this.nome = nome;
        this.salario = salario;
        this.id = id;
    }

    public void exibirDados() {
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: R$" + this.salario);
    }

    public abstract double calcularBonus();
}
