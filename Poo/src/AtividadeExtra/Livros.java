package AtividadeExtra;

import java.util.Scanner;

public class Livros {
    static Scanner sc = new Scanner(System.in);
    public static void main (String [] args){

       Biblioteca livor1 = new Biblioteca();

       System.out.println("digite o nome do livro");
       livor1.setTituLivro(sc.next());
       System.out.println("digite o nome do autor");
       livor1.setAutor(sc.next());
       System.out.println("digite o ano da publicação");
       livor1.setAnoPubli(sc.nextInt());


       System.out.println(livor1.toString());

        Biblioteca livor2 = new Biblioteca();

        System.out.println("digite o nome do livro");
        livor2.setTituLivro(sc.next());
        System.out.println("digite o nome do autor");
        livor2.setAutor(sc.next());
        System.out.println("digite o ano da publicação");
        livor2.setAnoPubli(sc.nextInt());

        System.out.println(livor2.toString());

        Biblioteca livor3 = new Biblioteca();

        System.out.println("digite o nome do livro");
        livor3.setTituLivro(sc.next());
        System.out.println("digite o nome do autor");
        livor3.setAutor(sc.next());
        System.out.println("digite o ano da publicação");
        livor3.setAnoPubli(sc.nextInt());

        System.out.println(livor3.toString());
    }
}
