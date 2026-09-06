package estruturascondicionais;

public class Switch {
    public static void main(String[] args) {
        //char, int , byte, short, enum, String
        byte day = 5;
        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
            default:
                System.out.println("Opção Invalida");
                break;
        }

        char sexo = 'O';
        switch (sexo){
            case 'M':
                System.out.println("Sexo Masculino");
                break;
            case 'F':
                System.out.println("Sexo Feminino");
                break;
            default:
                System.out.println("Opção Invalida");
        }

    }
}
