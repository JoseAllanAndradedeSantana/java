package classesabstratas.test;

import classesabstratas.domain.Desenvolvedor;
import classesabstratas.domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("teste",5000);
        Desenvolvedor dev = new Desenvolvedor("teste",12000);
        System.out.println(gerente);
        System.out.println(dev);
    }
}
