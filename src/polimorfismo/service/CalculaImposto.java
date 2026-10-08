package polimorfismo.service;

import polimorfismo.domain.Computador;
import polimorfismo.domain.Produto;

public class CalculaImposto {
    public static void calculaImposto(Produto produto){
        System.out.println("=================================");
        double imposto = produto.calcularImposto();
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(imposto);
    }
}
