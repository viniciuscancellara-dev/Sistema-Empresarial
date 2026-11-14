package empresa;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salario, int id){
        super(nome, salario, id);
    }

    @Override
    public double calcularBonus(){
        return salario * 1.05;
    }
}
