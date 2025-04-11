package CarrodeRespeito;

import java.util.Scanner;

public class menu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Carango carango = new Carango();

        System.out.println("quantidade de Rodas:");
        carango.setQuantidadeRodas(sc.nextInt());
        System.out.println("qual é o numero do chassi:");
        carango.setChassi(sc.next());
        System.out.println("qual a marca do veiculo:");
        carango.setMarca(sc.next());
        System.out.println("tipo do veiculo:");
        carango.setTipo(sc.next());


        System.out.println(carango.toString());

    }
}
