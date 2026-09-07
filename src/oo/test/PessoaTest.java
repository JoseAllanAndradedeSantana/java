package oo.test;

import oo.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Jose Allan";
        pessoa.idade = 36;
        pessoa.sexo = 'M';

        System.out.println("Nome: "+ pessoa.nome);
        System.out.println("Idade: "+ pessoa.idade);
        System.out.println("Sexo: "+ pessoa.sexo);
    }
}
