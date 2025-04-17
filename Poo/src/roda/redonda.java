package roda;

import java.util.Scanner;

public class redonda {
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        michelan michelan = new michelan();

        System.out.println("qual é o tipo da roda que você quer?");
        michelan.setTipo(sc.next());
        System.out.println("qual é o aro da roda");
        michelan.setAro(sc.nextInt());
        System.out.println("qual é o preço da roda?");
        michelan.setPreco(sc.nextInt());

        System.out.println(michelan.toString());
    }
}
