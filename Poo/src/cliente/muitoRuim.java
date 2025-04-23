package cliente;

import java.util.Scanner;

public class muitoRuim {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        atedimento recepcao = new atedimento();

        System.out.println("Nome do cliente");
        recepcao.setNomeCliente(sc.next());
        System.out.println("CPF do Cliente");
        recepcao.setCPF(sc.nextInt());
        System.out.println("Email do cliente");
        recepcao.setEmail(sc.next());

        System.out.println(recepcao.toString());

        atedimento mercado = new atedimento();

        System.out.println("Nome do cliente");
        mercado.setNomeCliente(sc.next());
        System.out.println("CPF do Cliente");
        mercado.setCPF(sc.nextInt());
        System.out.println("Email do cliente");
        mercado.setEmail(sc.next());

        System.out.println(mercado.toString());

        atedimento atedimento = new atedimento();

        System.out.println("Nome do cliente");
        atedimento.setNomeCliente(sc.next());
        System.out.println("CPF do Cliente");
        atedimento.setCPF(sc.nextInt());
        System.out.println("Email do cliente");
        atedimento.setEmail(sc.next());

        System.out.println(atedimento.toString());

        atedimento praga = new atedimento();

        System.out.println("Nome do cliente");
        praga.setNomeCliente(sc.next());
        System.out.println("CPF do Cliente");
        praga.setCPF(sc.nextInt());
        System.out.println("Email do cliente");
        praga.setEmail(sc.next());

        System.out.println(praga.toString());

    }
}