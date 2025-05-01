package ativ9;

import java.util.Scanner;

public class escravo {
    static Scanner sc = new Scanner (System.in);
    public static void main(String [] args){
     colaborado funcionario = new colaborado();

        System.out.println("digite o nome do funcionario");
        funcionario.setNome(sc.next());
        System.out.println("digite o salario do funcionario");
        funcionario.setSalario(sc.nextInt());
        System.out.println("digite o cargo do funcionario");
        funcionario.setCargo(sc.next());

        System.out.println(funcionario.toString());

        colaborado escravo = new colaborado();

        System.out.println("digite o nome do funcionario");
        escravo.setNome(sc.next());
        System.out.println("digite o salario do funcionario");
        escravo.setSalario(sc.nextInt());
        System.out.println("digite o cargo do funcionario");
        escravo.setCargo(sc.next());

        System.out.println(escravo.toString());

        colaborado pessoa = new colaborado();

        System.out.println("digite o nome do funcionario");
        pessoa.setNome(sc.next());
        System.out.println("digite o salario do funcionario");
        pessoa.setSalario(sc.nextInt());
        System.out.println("digite o cargo do funcionario");
        pessoa.setCargo(sc.next());

        System.out.println(pessoa.toString());

        colaborado patrao = new colaborado();

        System.out.println("digite o nome do funcionario");
        patrao.setNome(sc.next());
        System.out.println("digite o salario do funcionario");
        patrao.setSalario(sc.nextInt());
        System.out.println("digite o cargo do funcionario");
        patrao.setCargo(sc.next());

        System.out.println(patrao.toString());
    }
}
