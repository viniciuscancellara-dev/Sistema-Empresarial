package empresa;

public class Desenvolvedor extends Funcionario implements Autenticador {

    private String senha;
    public Desenvolvedor(String nome, double salario, int id, String senha){
        super(nome, salario, id);
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha){
        return senha.equals(this.senha);
    }

    @Override
    public double calcularBonus(){
        return salario * 1.25;
    }

}
