package Calcugeo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class menu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opc;
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

                    quadrado quadrado = new quadrado(cor, lado);

                    int opc2;
                    do {
                        opc2 = menuCalculo();

                        if (opc2 < 0 || opc2 > 3) {
                            System.out.println("opção invalida");
                        }


                        switch (opc2) {
                            case 1: {
                                System.out.println("perimetro:" + quadrado.calcularPerimetro());
                                break;
                            }
                            case 2: {
                                System.out.println("Area:" + quadrado.calculoArea());
                                break;
                            }
                            case 3: {
                                System.out.println("volume:" + quadrado.calcularVolume());
                                break;
                            }
                        }
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

                    Retangulo retangulo = new Retangulo(cor, largura, altura, comprimento);

                    int opc3;
                    do {
                        opc3 = menuCalculo();

                        if (opc3 < 0 || opc3 > 3) {
                            System.out.println("opção invalida");
                        }
                        switch (opc3) {
                            case 1: {
                                System.out.println("largura:" + retangulo.calcularPerimetro());
                                break;
                            }
                            case 2: {
                                System.out.println("altura:" + retangulo.calculoArea());
                                break;
                            }
                            case 3: {
                                System.out.println("comprimento:" + retangulo.calcularVolume());
                                break;
                            }
                        }
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
    static public void 

}