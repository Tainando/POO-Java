package machado;

import java.util.Scanner;

public class assis {
    static Scanner sc = new Scanner(System.in);
    public static void main (String [] args){
        de de = new de ();

        System.out.println("qual é o nome do livro");
        de.setTitulo(sc.next());
        System.out.println("qual é o autor do livro");
        de.setAutor(sc.next());
        System.out.println("em que ano o livro foi lançado");
        de.setDatalancamento(sc.nextInt());

        System.out.println(de.toString());
    }
}
