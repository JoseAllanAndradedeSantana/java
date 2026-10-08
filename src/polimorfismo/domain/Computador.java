package polimorfismo.domain;

public class Computador extends Produto{
    @Override
    public double calcularImposto() {
        return this.valor * 0.1;
    }

    public Computador(String nome, double valor) {
        super(nome, valor);

    }
}
