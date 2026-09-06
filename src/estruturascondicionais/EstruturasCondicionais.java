package estruturascondicionais;

public class EstruturasCondicionais {
    public static void main(String[] args){
        boolean isAtivo = true;
        int idade = 18;
        if(isAtivo){
            System.out.println("dentro do if");
        }

        if(idade >= 18){
            System.out.println("Autorizado a comprar bebida alcoolica");
        }

        //age < 15 categoria infantil
        //age >= 15 && age < 18 categoria juvenil
        //age >= 18 categoria adulto

        int age = 18;
        final String CATEGORIA_INFANTIL = "Categoria Infantil";
        final String CATEGORIA_JUVENIL = "Categoria Juvenil";
        final String CATEGORIA_ADULTO = "Categoria Adulto";

        if(age < 15){
            System.out.println(CATEGORIA_INFANTIL);
        }else if(age >= 15 && age < 18){
            System.out.println(CATEGORIA_JUVENIL);
        }else{
            System.out.println(CATEGORIA_ADULTO);
        }

        //Operador ternario
        double salario = 6000;
        String mensagemDoar = "Vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);


        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 /100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if(salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
        }else if(salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual * segundaFaixa;
        }else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println("Valor do Imposto: R$"+valorImposto);
    }
}
