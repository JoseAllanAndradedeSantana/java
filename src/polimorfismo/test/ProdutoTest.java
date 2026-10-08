package polimorfismo.test;

import polimorfismo.domain.Computador;
import polimorfismo.domain.Produto;
import polimorfismo.domain.Televisao;
import polimorfismo.service.CalculaImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Allan",10000);
        Televisao tv = new Televisao("Samsung",5000);

        CalculaImposto.calculaImposto(tv);
        CalculaImposto.calculaImposto(computador);
    }
}
