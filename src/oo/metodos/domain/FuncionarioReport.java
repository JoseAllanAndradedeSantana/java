package oo.metodos.domain;

public class FuncionarioReport {
    public void imprime(Funcionario funcionario){
        System.out.println("####Relatorio Funcionário####");
        System.out.println("Nome: "+funcionario.nome);
        System.out.println("Idade: "+funcionario.idade);
        calculaMediaSalario(funcionario.salarios);
        System.out.println("#############################");
    }

    private void calculaMediaSalario(double[] salarios) {
        double media = 0;
        double soma = 0;
        for(int i =0; i < salarios.length;i++){
            soma += salarios[i];
        }

        media = soma / salarios.length;
        System.out.println("Média Salarial: R$"+media);
    }
}
