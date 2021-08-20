package com.desafio.banco;

public abstract class Conta implements ContaConta{

    protected static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    public String banco;
    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getConta() {
        return conta;
    }
    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosExtrato() {
        System.out.println(String.format("Nome: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência %s", this.agencia));
        System.out.println(String.format("Conta %d", this.conta));
        System.out.println(String.format("Saldo disponível %.2f", this.saldo));
        System.out.println("\n");
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

}
