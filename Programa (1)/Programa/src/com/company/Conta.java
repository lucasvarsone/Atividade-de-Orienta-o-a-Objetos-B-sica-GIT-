package com.company;

public class Conta {
    int numero;
    String titular;
    String agencia;
    double saldo;
    String dataAbertura;

    void saque(double qntdS) {
        double nSaldo = this.saldo - qntdS;
        this.saldo = nSaldo;
    }

    void deposito(double qntdD) {
        this.saldo += qntdD;
    }

    double rendimento() {
        this.saldo = saldo + (saldo / 100);
        return saldo;
    }

    String dadosConta() {
        String dados = "Titular da conta: " + this.titular;
        dados += "\nNumero da conta: " + this.numero;
        dados += "\nAgencia: " + this.agencia;
        return dados;
    }
}
