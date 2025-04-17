package Lazanha;

import java.util.Scanner;

public class MecanicoKauan {
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        opala opala = new opala();

        System.out.println("qual é a marca do carro?");
        opala.setNome(sc.next());
        System.out.println("qual é o modelo do carro?");
        opala.setModelo(sc.next());
        System.out.println("qual é o ano do carro");
        opala.setAno(sc.nextInt());

        System.out.println(opala.toString());
    }
}
