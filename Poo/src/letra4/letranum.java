package letra4;


import java.util.Scanner;

public class letranum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args) {
        numeroD letra1 = new numeroD();

        System.out.println("digite o nome do aluno");
        letra1.setNome(sc.next());
        System.out.println("digite o cadastro do aluno");
        letra1.setIdade(sc.nextInt());
        System.out.println("digite a nota do aluno");
        letra1.setNotaFinal(sc.nextInt());

        System.out.println(letra1.toString());

        numeroD letra12 = new numeroD();

        System.out.println("digite o nome do aluno");
        letra12.setNome(sc.next());
        System.out.println("digite o cadastro do aluno");
        letra12.setIdade(sc.nextInt());
        System.out.println("digite a nota do aluno");
        letra12.setNotaFinal(sc.nextInt());

        System.out.println(letra12.toString());

        numeroD letra31 = new numeroD();

        System.out.println("digite o nome do aluno");
        letra31.setNome(sc.next());
        System.out.println("digite o cadastro do aluno");
        letra31.setIdade(sc.nextInt());
        System.out.println("digite a nota do aluno");
        letra31.setNotaFinal(sc.nextInt());

        System.out.println(letra31.toString());
    }
}
