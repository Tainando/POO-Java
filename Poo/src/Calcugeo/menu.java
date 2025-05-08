package Calcugeo;

import java.util.Scanner;

public class menu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("sistema de Calculadora de Forma Geometrica");
        System.out.println("Qual forma você deseja usar?");
        System.out.println("opções: \n"+
        "1. quadrado\n" +
        "2.retangulo");
        int opc = sc.nextInt();

        switch (opc){
            case 1:{
            System.out.println("digite a cor do quadadro");
            String cor = sc.next();
            System.out.println("digite o lado:");
            double lado = sc.nextDouble();

            quadrado quadrado = new quadrado(cor,lado);
                System.out.println("perimetro:" + quadrado.calcularPerimetro());
                System.out.println("Area:" + quadrado.calculoArea());
                System.out.println("volume:"+ quadrado.calcularVolume());
            break;
            }
        }

    }
}
