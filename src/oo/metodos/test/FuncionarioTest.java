package oo.metodos.test;

import oo.metodos.domain.Funcionario;
import oo.metodos.domain.FuncionarioReport;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        FuncionarioReport funcionarioReport = new FuncionarioReport();
        funcionario.nome = "Jose Allan";
        funcionario.idade = 36;
        funcionario.salarios = new double[]{4500,6000,5000};
        funcionarioReport.imprime(funcionario);

    }
}
