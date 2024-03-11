package edu.charles.bancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente charles = new Cliente();
        charles.setNome("Charles");

        Conta cc = new ContaCorrente(charles);
        Conta poupanca = new ContaPoupanca(charles);

        cc.depositar(1000);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        cc.imprimirInfosComuns();
    }
}
