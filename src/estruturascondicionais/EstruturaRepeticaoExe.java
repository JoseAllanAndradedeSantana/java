package estruturascondicionais;

public class EstruturaRepeticaoExe {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 10000
        for (int i = 1; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50
        int valorMaximo = 50;
        for (int i =0; i<= valorMaximo; i++){
            if(i <= 25){
                System.out.println(i);
            }
            System.out.println("i = "+ i);
        }

        //melhor processamento
        for (int i =0; i<= valorMaximo; i++){
            if(i >= 25){
                System.out.println(i);
                break;
            }
            System.out.println("i = "+ i);
        }

        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valor da parcela >= 1000
        double valorCarro = 40000;
        for (int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if(valorParcela >= 1000){
                System.out.println("Parcela "+parcela+" R$ "+valorParcela);
            }else {
                break;
            }
        }
        for (int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                break;
            }
                System.out.println("Parcela "+parcela+" R$ "+valorParcela);
        }
    }
}
