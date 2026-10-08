package interfaces.domain;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carregando Arquivo do banco de dados");
    }
}
