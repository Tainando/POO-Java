package mundoAnimal;

import java.util.Scanner;

public class bicho {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        animal animal = new animal();

        System.out.println("qual é o tipo do animal?");
        animal.setTipo(sc.next());
        System.out.println("qual é o nome do animal?");
        animal.setNomeAnimal(sc.next());
        System.out.println("qual é a raça do animal?");
        animal.setRaca(sc.next());
        System.out.println("quantos anos tem o animal?");
        animal.setIdade (sc.nextInt());

        System.out.println(animal.toString());
    }
}
