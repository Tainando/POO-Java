package AtividadeExtra;

import java.util.ArrayList;
import java.util.Scanner;

public class Livros {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Biblioteca> Biblioteca = new ArrayList<>();

        for (int contador = 0; contador < 5; contador++) {
            Biblioteca livro = new Biblioteca();
            System.out.println("digite o nome do livro");
            livro.setTituLivro(sc.next());
            System.out.println("digite o nome do autor");
            livro.setAutor(sc.next());

            while (livro.getAnoPubli() < 1900) {
                System.out.println("digite o ano da publicação");
                livro.setAnoPubli(sc.nextInt());
                System.out.println("data Invalida");
                livro.setAnoPubli(sc.nextInt());
            }
            System.out.println(livro.toString());
        }
    }
}