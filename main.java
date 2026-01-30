package ExercicioPoo;

public class main{
    public static void main(String[] args){

        //criar um objeto da classe Pessoa 
        Pessoa pessoa1 = new Pessoa();

        //Dar sentido aos meétodos da instancia
        pessoa1.setNome("Jeizy");
        System.out.println("Obtém o nome da pessoa 1: "+pessoa1.getNome());
        pessoa1.setIdade(22);
        System.out.println("Obtém a idade da pessoa 1: "+pessoa1.getIdade());

        System.out.println();


        Pessoa pessoa2 = new Pessoa();
        //Dar sentido aos meétodos da instancia
        pessoa2.setNome("Diego");
        System.out.println("Obtém o nome da pessoa 2: "+pessoa2.getNome());
        pessoa2.setIdade(50);
        System.out.println("Obtém a idade da pessoa 2: "+pessoa2.getIdade());

        //Aterar o nome da pessoa 1
        System.out.println("Emanuel");
        System.out.println("Novo nome da pessoa1: "+pessoa1.getNome());

       


}

    
}
