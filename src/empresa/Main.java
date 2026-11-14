package empresa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Desenvolvedor desenvolvedor = new Desenvolvedor("Carlos", 6000.00, 1, "dev123");
        Gerente gerente = new Gerente("Mariana", 9000.00, 2, "ger456");
        Estagiario estagiario = new Estagiario("Lucas", 1500.00, 3);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(desenvolvedor);
        funcionarios.add(gerente);
        funcionarios.add(estagiario);

        SistemaEmpresa sistema = new SistemaEmpresa();

        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirDados();
            sistema.processarBonus(funcionario);
            System.out.println();
        }

        Autenticador usuario = gerente;
        sistema.acessarSistema(usuario, "ger456");
        sistema.acessarSistema(usuario, "senhaErrada");
        System.out.println();

        Gerenciar gerenciavel = gerente;
        gerenciavel.gerarRelatorio();
    }
}
