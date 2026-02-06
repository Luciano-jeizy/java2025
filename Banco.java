package Exer32;

public class Banco {

    //variáveis de instância 
    public double saldo;
    double saldoAnterior = 0.0;

    //Método para definir saldo atual e atualizar o saldo anterior
    public void definirSaldo(double novoSaldo){
        this.saldoAnterior = this.saldo;
        this.saldo = novoSaldo;
      
    }
    
    //Método para exibir saldo atual e saldo anterior
    public void exibirSaldo(){
        System.out.println("Saldo anterior: " + saldoAnterior);
        System.out.println("Saldo atual: " + saldo);

    }


    public void obterSaldo(){
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Saldo anterior: " + saldoAnterior);
    }

    public void depositar(double valor){
        this.saldoAnterior = this.saldo;
        this.saldo += valor;
    }

    public void levantar(double valor){
        if (valor >0 && saldo <= valor) {
            this.saldoAnterior = this.saldo;
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para levantar.");
        }
    }

    




  


    
}
