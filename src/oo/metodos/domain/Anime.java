package oo.metodos.domain;

public class Anime {
    private String tipo;
    private static int[] episodios;
    // 0 - bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaco em memoria pro objeto
    // 2 - cada atributo de classe é criado e inicializado com valores dafault ou o que for passado
    // 3 - bloco de inicialização é executado
    // 4 - construtor é executado
    //bloco de inicialização de instancia
    static {
        System.out.println("Dentro do bloco de inicialização static");
        Anime.episodios = new int[100];
        for(int i=0; i < Anime.episodios.length; i++){
            Anime.episodios[i] = i+1;
        }
        for(int episodio:Anime.episodios){
            System.out.print(episodio + " ");
        }
    }
    {
        System.out.println();
        System.out.println("Dentro do bloco de inicialização");
    }

    public Anime(){

    }

}
