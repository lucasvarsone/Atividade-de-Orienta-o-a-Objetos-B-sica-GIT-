package com.company;

public class Main {
    public static void main(String[] args) {
        Conta contaAnderson;
        Conta contaSidney;
        Conta contaLeo;
        contaAnderson = new Conta();
        contaSidney = new Conta();
        contaLeo = new Conta();

        contaSidney.titular = "Sidnelson";
        contaSidney.saldo = 384.00;

        contaLeo.titular = "Leonardo";
        contaLeo.saldo = 8991.00;

        contaAnderson.titular = "Anderson";
        contaAnderson.saldo = 2587.00;
        contaAnderson.numero = 642;
        contaAnderson.agencia = "0087-2";
        contaAnderson.dataAbertura = "01/01/2019";

        contaAnderson.saque(0.00);
        contaAnderson.deposito(0.00);

        System.out.println("Saldo atual: " + contaAnderson.saldo);
        System.out.println("Rendimento mensal: " + contaAnderson.rendimento());
        System.out.println(contaAnderson.dadosConta());

        contaLeo = contaSidney;

        if (contaAnderson == contaSidney) {
            System.out.println("As contas são iguais");
        } else {
            System.out.println("As contas são diferentes");
        }

        if (contaLeo == contaSidney) {
            System.out.println("As contas são iguais");
        } else {
            System.out.println("As contas são diferentes");
        }
    }
}
