package shopee;

import java.util.Scanner;

public class produto {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
    perigo perigo = new perigo();

        System.out.println("digite o nome do produto");
        perigo.setNome(sc.next());
        System.out.println("digite o preço do produto");
        perigo.setPreco(sc.nextInt());
        System.out.println("digite a quantidade dos produtos");
        perigo.setQuantEstoque(sc.nextInt());

        System.out.println(perigo.toString());

        perigo anao = new perigo();
        System.out.println("digite o nome do produto");
        anao.setNome(sc.next());
        System.out.println("digite o preço do produto");
        anao.setPreco(sc.nextInt());
        System.out.println("digite a quantidade dos produtos");
        anao.setQuantEstoque(sc.nextInt());

        System.out.println(anao.toString());
    }
}
