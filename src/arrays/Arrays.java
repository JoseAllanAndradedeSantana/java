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

        //1,2,3,4,5 meses
        //31,28,31,30 dias
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;

        dias[2][0] = 31;
        dias[2][1] = 31;
        dias[2][2] = 31;

        for(int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }

        for(int[] arrayDia : dias){
            for (int dia : arrayDia){
                System.out.println(dia);
            }
        }

        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int [2];
        arrayInt[1] = new int [4];
        arrayInt[2] = new int [8];

        for(int[] arrayBase: arrayInt){
            System.out.println("\n-----------");
            for(int numero:arrayBase){
                System.out.print(numero + " ");
            }
        }


    }
}
