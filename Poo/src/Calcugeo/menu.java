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
                    "2.retangulo \n" +
                    "3.Circulo\n");
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

                        retornarCalculo(opc3, forma);
                    } while (opc3 != 0);
                    break;
                }
                case 3: {
                    System.out.println("digite a cor do circulo");
                    String cor = sc.next();
                    System.out.println("digite o raio do circulo ");
                    double raio = sc.nextDouble();

                    forma = new circulo(cor, raio);

                    int opc4;
                    do {
                        opc4 = menuCalculo();

                        retornarCalculo(opc4, forma);
                    } while (opc4 != 0);
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
    static public void retornarCalculo(int opc, formaGeo forma) {
        if (opc < 0 || opc > 4)
            System.out.println("opção invalida");

        switch (opc) {
            case 1: {
                System.out.println("perimetro:" + forma.calcularPerimetro());
                break;
            }
            case 2: {
                System.out.println("Area:" + forma.calculoArea());
                break;
            }
            case 3: {
                System.out.println("volume:" + forma.calcularVolume());
                break;
            }
        }
    }
}