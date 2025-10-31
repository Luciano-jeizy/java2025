public class Actividade14{
    public static void main (String[] args){

        int[] dias ={31,28,31,30,31,30,31,30,31,30,31,31};
        String[] meses ={"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Agos","Set","Out","Nov","Dez"};
        for(int i=0; i< dias.length; i++) {
            System.out.println("O mês de " + meses[i] + " tem " + dias[i] +" dias.");


        }
    }
}