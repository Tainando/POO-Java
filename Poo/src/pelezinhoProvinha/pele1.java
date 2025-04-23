package pelezinhoProvinha;

import java.util.Scanner;

public class pele1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args) {
        pelezinho1 pele = new pelezinho1();

        System.out.println("Nome do Funcionario");
        pele.setNome(sc.next());
        System.out.println("a maricula do funcionario");
        pele.setMatricula(sc.nextInt());
        System.out.println("o salario do funcionario");
        pele.setSalario(sc.nextInt());


        System.out.println(pele.toString());

        System.out.println("nome do funcionario");
        pele.setNome(sc.next());
        System.out.println("matricula do funcionario");
        pele.setMatricula(sc.nextInt());
        System.out.println("salario do funcionario");
        pele.setSalario(sc.nextInt());

        System.out.println(pele.toString());
    }
}
