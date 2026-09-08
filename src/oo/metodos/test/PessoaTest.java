package oo.metodos.test;

import oo.metodos.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Allan");
        pessoa.setIdade(36);
        pessoa.imprime();
    }
}
