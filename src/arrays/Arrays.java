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


    }
}
