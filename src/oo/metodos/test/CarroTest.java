package oo.metodos.test;

import oo.metodos.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 =  new Carro("BMW",280);
        Carro carro2 =  new Carro("MERCEDES",275);
        Carro carro3 =  new Carro("AUDI",290);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
