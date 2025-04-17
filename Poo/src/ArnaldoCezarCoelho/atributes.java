package ArnaldoCezarCoelho;

import java.util.Scanner;

public class atributes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        Pessoa Pessoa = new Pessoa();

        System.out.println("Qual é o nome da pessoa?");
        Pessoa.setNome(sc.next());
        System.out.println("qual a idade da Pessoa?");
        Pessoa.setIdade(sc.nextInt());

        System.out.println(Pessoa.toString());
    }
}
