package ativ7;

import java.util.Scanner;

public class casadosorrizo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        sorrizo sorrizo = new sorrizo();

        System.out.println("digite o nome da rua");
        sorrizo.setRua(sc.next());
        System.out.println("digite o cep da rua");
        sorrizo.setNumero(sc.nextInt());
        System.out.println("digite o nome cidade");
        sorrizo.setCidade(sc.next());

        System.out.println(sorrizo.toString());
    }
}
