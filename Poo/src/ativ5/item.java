package ativ5;

import java.util.Scanner;

public class item {
    static Scanner sc = new Scanner(System.in);
    public static void main(String [ ]args){
        produto perigo = new produto();

        System.out.println("qual é o nome do produto");
        perigo.setNome(sc.next());
        System.out.println("me de a descrição do produto");
        perigo.setDescricao(sc.next());
        System.out.println("quantos tem desse produto");
        perigo.setQuantEstoque(sc.nextInt());

        System.out.println(perigo.toString());

        produto item = new produto();

        System.out.println("qual é o nome do produto");
        item.setNome(sc.next());
        System.out.println("me de a descrição do produto");
        item.setDescricao(sc.next());
        System.out.println("quantos tem desse produto");
        item.setQuantEstoque(sc.nextInt());

        System.out.println(item.toString());

        produto treco = new produto();

        System.out.println("qual é o nome do produto");
        treco.setNome(sc.next());
        System.out.println("me de a descrição do produto");
        treco.setDescricao(sc.next());
        System.out.println("quantos tem desse produto");
        treco.setQuantEstoque(sc.nextInt());

        System.out.println(treco.toString());

        produto troco = new produto();

        System.out.println("qual é o nome do produto");
        troco.setNome(sc.next());
        System.out.println("me de a descrição do produto");
        troco.setDescricao(sc.next());
        System.out.println("quantos tem desse produto");
        troco.setQuantEstoque(sc.nextInt());

        System.out.println(troco.toString());
    }
}
