package oo.metodos.domain;

public class Calculadora {

    public void somar(int numero1,int numero2){
        System.out.println("Executando o Calculo");
        int resultado = numero1+numero2;
        System.out.println("Calculo finalizado");
        System.out.println(resultado);
    }

    public void subtrair(int numero1,int numero2){
        System.out.println(numero1 - numero2);
    }
}
