package arrays;

public class Arrays {
    public static void main(String[] args) {
        //byte, short, int, long, float, double  iniciam com 0
        // char '\u0000' ' '
        //boolean false
        //String null
        int[] idades = new int[3];
        idades[0] = 36;
        idades[1] = 34;
        idades[2] = 3;

        for (int i = 0; i < idades.length;i++){
            System.out.println("idade "+ i +" " +idades[i]);
        }

        String[] nomes = new String[5];
        nomes[0] = "Jose Allan Andrade de Santana";
        nomes[1] = "Mariane Santana da Silva Andrade";
        nomes[2] = "Isaac Santana da Silva Andrade";
        nomes[3]= "Manuella Santana da Silva Andrade";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        String[] times = {"Santos","São Paulo","Palmeiras","Corinthians"};

        for (int i =0;i<times.length;i++){
            System.out.println(times[i]);
        }

        for(String time:times){
            System.out.println(time);
        }

    }
}
