package estruturascondicionais;

public class EstruturaRepeticao {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while(count <= 10){
            System.out.println(count);
            count++;
        }
        count = 0;
        do{
            System.out.println("Do While " + count);
            count++;
        } while(count <= 10);

        for(int i =0; i <= 10; i++){
            System.out.println("For "+ i);
        }

        int numeroDigitado = 5;
        int soma =0;
        while (numeroDigitado != 0){
            soma += numeroDigitado;
            numeroDigitado--;
        }
        System.out.println("Soma: "+soma);
    }
}
