package oo.test;

import oo.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fox";
        carro1.modelo = "Volsk";
        carro1.ano = 2015;

        carro2.nome = "AirCross";
        carro2.modelo = "Citroen";
        carro2.ano = 2020;

        System.out.println(carro1.nome+" "+carro1.modelo+" "+ carro1.ano);
        System.out.println(carro2.nome+" "+carro2.modelo+" "+ carro2.ano);
    }
}
