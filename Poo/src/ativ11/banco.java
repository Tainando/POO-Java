package ativ11;

import java.util.Scanner;

public class banco {
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        emprestimo agiota = new emprestimo();

        System.out.println("qual é o valor do emprestimo");
        agiota.setValor(sc.nextInt());
        System.out.println("quando foi deito o emprestimo");
        agiota.setDataEmprestimo(sc.nextInt());
        System.out.println("quantos é a parcela do emprestimo");
        agiota.setNumPracelas(sc.nextInt());

        System.out.println(agiota.toString());

        emprestimo agio = new emprestimo();

        System.out.println("qual é o valor do emprestimo");
        agio.setValor(sc.nextInt());
        System.out.println("quando foi deito o emprestimo");
        agio.setDataEmprestimo(sc.nextInt());
        System.out.println("quantos é a parcela do emprestimo");
        agio.setNumPracelas(sc.nextInt());

        System.out.println(agio.toString());

        emprestimo ta = new emprestimo();

        System.out.println("qual é o valor do emprestimo");
        ta.setValor(sc.nextInt());
        System.out.println("quando foi deito o emprestimo");
        ta.setDataEmprestimo(sc.nextInt());
        System.out.println("quantos é a parcela do emprestimo");
        ta.setNumPracelas(sc.nextInt());

        System.out.println(ta.toString());

        emprestimo agi = new emprestimo();

        System.out.println("qual é o valor do emprestimo");
        agi.setValor(sc.nextInt());
        System.out.println("quando foi deito o emprestimo");
        agi.setDataEmprestimo(sc.nextInt());
        System.out.println("quantos é a parcela do emprestimo");
        agi.setNumPracelas(sc.nextInt());

        System.out.println(agi.toString());
    }
}
