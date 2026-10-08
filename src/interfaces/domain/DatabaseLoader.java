package interfaces.domain;

public class DatabaseLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Conectando ao banco de dados");
        System.out.println("==========log===================================");
        System.out.println("=SELECT nome , cpf FROM cliente;================");
        System.out.println("Carregando dados do banco de dados");
        System.out.println("==cliente:Allan = cpf:**********");
    }
}
