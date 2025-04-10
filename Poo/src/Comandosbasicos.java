import java.util.Scanner;

public class Comandosbasicos {
    static Scanner sc = new Scanner(System.in);//prompt = escrever a mensagem mensagem
    public static void main(String[] args) {
    System.out.println("hello everyone");

    boolean trueorfalse = true;
    int numerointeiro = 0;// int = 1000000000 a -1000000000
    double decimais = 0.2;// double = 10000.200 a -100000.400
    char letra = 'A';

    //variavel tipo obj
    String texto = "Texto";
    Integer numerointeiro2 = 2;


    String nome = null;
    String sexo = "";

    System.out.println("qual é o nome?");
    nome = sc.nextLine();

    System.out.println("O seu nome é " + nome);

        System.out.println("qual é o seu genero?");
        sexo = sc.nextLine();

        System.out.println("O seu nome é " + sexo);

    }
}