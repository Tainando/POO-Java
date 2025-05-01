package ativ8;

import java.util.Scanner;

public class saldo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        ContaBancaria saldo = new ContaBancaria();

        System.out.println("digite o numero da conta");
        saldo.setNumeroContaUm(sc.nextInt());
        System.out.println("digite o saldo da conta");
        saldo.setContaUm(sc.nextInt());

        System.out.println(saldo.toString());

        ContaBancaria saldo2 = new ContaBancaria();

        System.out.println("digite o numero da conta");
        saldo2.setNumeroContaDoesh(sc.nextInt());
        System.out.println("digite o saldo da conta");
        saldo2.setContaDoesh(sc.nextInt());

        System.out.println(saldo2.toString());
    }
}
