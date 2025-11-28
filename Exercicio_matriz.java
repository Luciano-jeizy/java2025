public class Exercicio_matriz{
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
    public  static void main(String[]args) {
        criarMatriz();
        
    }
}