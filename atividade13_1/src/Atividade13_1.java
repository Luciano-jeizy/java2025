import java.util.Scanner;
public class Atividade13_1 {
    public static void main (String[]args) {
        //Criar objeto
        Scanner input = new Scanner(System.in);

        //Entrada do utilizador
        System.out.print("Insere o primeiro número: ");
        double num_1 = input.nextInt();
        System.out.print("Insere o segundo número: ");
        double num_2 = input.nextInt();
        System.out.print("Escolhe o operador:   +,-,*,/"  );
        char op = input.next().charAt(0);

        switch(op){
            case '+':
                double soma = num_1+num_2;
                System.out.println(soma);
                break;
            case '-':
                double sub = num_1-num_2;
                System.out.println(sub);
                break;
            case '*':
                double mult = num_1*num_2;
                System.out.println(mult);
                break;
            case '/':
                if(num_2==0){
                    System.out.println("A operação por zero é impossível.");
                } else{
                    double div = num_1/num_2;
                    System.out.println(div);
                }
                break;
            default:
                System.out.println("Operador inválido.");
        }
        input.close();

    }
}