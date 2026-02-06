package ExercicioPoo;

public class Bolo {
    //variáveis de instância 
    public String sabor;
    public int tamanho;
    public boolean cobertura; 

    //Métodos para apresentar os detalhes do bolo
    public  void exibirDetalhes(){
        System.out.println("Sabor: " +sabor);
        System.out.println("Tamanho: "+tamanho);
        System.out.println("Cobertura: " +cobertura);
    }

    //Métudo para adicionar cobertura 
    public  void adicionarCobertura(){
        this.cobertura = true;
    }
        
    //Métodos Get/Set
    public void setSabor(String novoSabor){
        this.sabor = novoSabor;
    }

    public String getSabor(){
        return this.sabor ;

    }

     public void setTamanho(int novoTamanho){
        this.tamanho = novoTamanho;
    }

     public int getTamanho(){
        return this.tamanho ;

    }

    public void setCobertura(int novoTamanho){
        this.tamanho = novoTamanho;
    }


        



}


