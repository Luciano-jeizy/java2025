import java.util.Scanner;

public class Exe_1{
    static void criarMatriz(){
        
        // criar matriz 3x3
        int matriz[][] = new int[3][3];

        //prencher matriz
        matriz[0][0]= 1;  matriz[0][1]= 2;  matriz[0][2]= 3;
        matriz[1][0]=4;  matriz[1][1]= 5;  matriz[1][2]= 6;
        matriz[2][0]= 7;  matriz[2][1]= 8;  matriz[2][2]= 9;

        //printar os dados da matriz
        for(int i = 0; i< matriz.length;i++){
            for (int j = 0 ; j <matriz.length; j++){
                System.out.print(matriz[i][j] + " - ");
            }
            // mudar de linha
            System.out.println();
        }  
    }  


    //Métodos com linhas e colunas pedidas ao utilizador
    static void criarMatriz(int linhas, int colunas){
        Scanner teclado = new Scanner (System.in);
    
        // criar matriz 3x3
        int matriz[][] = new int[linhas][colunas];

    
        //pedir o utilizador para inserir os dados na  matriz
        for(int i = 0; i< matriz.length;i++){
            for (int j = 0 ; j <matriz.length; j++){
                System.out.printf("Posição [%d] [%d]: %n", i, j);
                matriz[i][j] = teclado.nextInt();
            }
        }
    }  


    public  static void main(String[]args) {
        criarMatriz();
        
        //Criar objeto scanner
        Scanner teclado  = new Scanner (System.in);

        //Pedir ao utilizador linhas 
        System.out.println("Insira a quantiade de linhas: ");
        int linhas = teclado.nextInt();

        //pedir ao utlizador colunas
        System.out.println("Insira a quantidade de colunas: ");
        int colunas = teclado.nextInt();

        criarMatriz(linhas , colunas);

        teclado.close();
        
    }
}
