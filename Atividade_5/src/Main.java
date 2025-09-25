public class Main {
    public static void main(String[] args) {

        int diasemana = 5;

        switch (diasemana) {
            case 1:
                System.out.println("Hoje é Domingo.");
                break;

            case 2:
                System.out.println("Hoje é Segunda-feira.");
                break;

            case 3:
                System.out.println("Hoje é Terça-feira.");
                break;

            case 4:
                System.out.println("Hoje é Quarta-feira.");
                break;

            case 5:
                System.out.println("Hoje é Quinta-feira.");
                break;
            case 6:
                System.out.println("Hoje é Sexta-feira.");
                break;


            case 7:
                System.out.println("Hoje é Sábado.");
                break;

            default:
                System.out.println("Não é dia da semana!");


        }
    }

}