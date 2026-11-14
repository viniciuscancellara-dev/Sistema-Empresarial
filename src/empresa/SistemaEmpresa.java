package empresa;

public class SistemaEmpresa{

    public void processarBonus(Funcionario funcionario){

        double bonus = funcionario.calcularBonus();
        System.out.println("Bonus + Salario: R$" + bonus);
    }

    public void acessarSistema(Autenticador usuario, String senha ){

        if(usuario.autenticar(senha)){
            System.out.println("Acesso permitido!");
        }else{
            System.out.println("Acesso negado!");
        }

    }
}
