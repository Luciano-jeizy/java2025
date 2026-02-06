package Exer32;

import Exer32.Banco;

public class Main {
    public static void main(String[] args) {
        Banco bancoJeizy = new Banco();
        Banco bancoDiego = new Banco();

        //Definir os valores das variáveis
        bancoJeizy.saldo = 1000.0;
        bancoDiego.definirSaldo(500);
        bancoJeizy.levantar(500);
        

        bancoJeizy.exibirSaldo();
        bancoDiego.exibirSaldo();
    }
    
}
