package empresa;

public class Gerente extends Funcionario implements Autenticador, Gerenciar {

    private String senha;
    public Gerente(String nome, double salario, int id, String senha){
        super(nome, salario, id);
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha){
        return senha.equals(this.senha);
    }

    @Override
    public void gerarRelatorio(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Salario: R$" + salario);
        System.out.println("Cargo: empresa.Gerente");
        System.out.println("Relatorio enviado com sucesso!");
    }

    @Override
    public double calcularBonus(){
        return salario * 1.5;
    }

}
