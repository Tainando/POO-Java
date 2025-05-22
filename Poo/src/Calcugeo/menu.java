package Calcugeo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class menu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opc;
        formaGeo forma;
        do {
            System.out.println("bem vindo ao sistema de Calculadora de Forma Geometrica");
            System.out.println("Qual forma você deseja usar?");
            System.out.println("opções: \n" +
                    "0. Sair\n" +
                    "1. quadrado\n" +
                    "2.retangulo \n");
            opc = sc.nextInt();

            switch (opc) {
                case 0: {
                    System.out.println("obrigado pela colaboração");
                    break;
                }
                case 1: {
                    System.out.println("digite a cor do quadadro");
                    String cor = sc.next();
                    System.out.println("digite o lado:");
                    double lado = sc.nextDouble();

                    forma = new quadrado(cor, lado);

                    int opc2;
                    do {
                        opc2 = menuCalculo();
                        retornarCalculo(opc2, forma);
                    } while (opc2 != 0);
                    break;
                }
                case 2: {
                    System.out.println("digite a cor do retangulo");
                    String cor = sc.next();
                    System.out.println("digite a largura do retangulo:");
                    double largura = sc.nextDouble();
                    System.out.println("digite a altura do retangulo");
                    double altura = sc.nextDouble();
                    System.out.println("digite o comprimento do retangulo");
                    double comprimento = sc.nextDouble();

                    forma = new Retangulo(cor, largura, altura, comprimento);

                    int opc3;
                    do {
                        opc3 = menuCalculo();
                        retryCalculo(opc3, forma);
                    } while (opc3 != 0);
                    break;
                }
            }
        } while (opc != 0);
    }

    static public int menuCalculo() {
        System.out.println("Qual calculo deseja fazer?");
        System.out.println("Opções: \n"
                + "0. Voltar \n"
                + "1. Perimetro\n"
                + "2. Area\n"
                + "3. Volume\n");
        return sc.nextInt();
    }
    static public void retornarCalculo(int opc2, formaGeo forma) {
        if (opc2 == 1){
            System.out.println("perimetro:" + forma.calcularPerimetro());

        }
        if (opc2 == 2) {
            System.out.println("Area:" + forma.calculoArea());

        }
        if (opc2 == 3) {
            System.out.println("volume:" + forma.calcularVolume());

        }
    }

    static public void retryCalculo(int opc3, formaGeo forma) {
        if (opc3 == 1) {
            System.out.println("largura:" + forma.calcularPerimetro());
        }
        if (opc3 == 2) {
            System.out.println("altura:" + forma.calculoArea());
        }
        if (opc3 == 3) {
            System.out.println("comprimento:" + forma.calcularVolume());
        }
    }
}

