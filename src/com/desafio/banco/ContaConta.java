package com.desafio.banco;

public interface ContaConta {
     void sacar(double valor);

     void depositar(double valor) ;

     void transferir(double valor, Conta contaDestino);

     void imprimirExtrato();
}
