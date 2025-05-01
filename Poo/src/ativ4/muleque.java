package ativ4;

import java.util.Scanner;

public class muleque {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        burro burro = new burro();

        System.out.println("qual é o nome do aluno");
        burro.setNome(sc.next());
        System.out.println("qual é a matricula do aluno");
        burro.setMatricula(sc.nextInt());
        System.out.println("qual é a nota fina do aluno");
        burro.setNotaFinal(sc.nextInt());

        System.out.println(burro.toString());
    }
}
