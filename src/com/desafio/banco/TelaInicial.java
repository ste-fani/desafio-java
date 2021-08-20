package com.desafio.banco;

public class TelaInicial {
    public static void main(String[] args) {
        Cliente larissa = new Cliente();
        larissa.setNome("Larissa Matos");


        Conta cc = new ContaCorrente(larissa);
        Conta poupanca = new ContaPoupanca(larissa);

        System.out.println("BANCO REGIONAL DO NOROESTE");
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        System.out.println("Fim do Extrato Bancário");
    }
}
