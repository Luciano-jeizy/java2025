public class Ex30 {
    public static void main(String[] args) {
       
        //criar lista
        double[] notas ={12,14,18,15,20};

        //variável para somar as notas
        double soma = 0;

        double media = 0;
        int mediaConvertida=0;
        int  alunos = notas.length;

        //soma de todas as notas
        for(int i=0 ; i< notas.length; i++){
            soma+= notas[i];

            //calcular a media
            media = soma/ i;
            mediaConvertida =(int)media;
        }
    
        //imprimir os resultados
        System.out.println("Número total de alunos: " +alunos);
        System.out.println("media original : " +media);
        System.out.println("media convertida: " +mediaConvertida);
    }
}
