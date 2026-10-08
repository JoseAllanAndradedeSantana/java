package enumeracao.test;

import enumeracao.domain.Cliente;
import enumeracao.enuns.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Allan", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente1.toString());
    }
}
