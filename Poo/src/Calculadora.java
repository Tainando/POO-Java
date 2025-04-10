import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double num1, num2;
        int tipoCalculo;

        System.out.println("Bem vindo a calduladora, seu ruim de matematica");
        System.out.println("escreva o primeiro valor");
        num1 = sc.nextDouble();
        System.out.println("escreva o segundo valor");
        num2 = sc.nextDouble();
        System.out.println("escreva o tipo de calculo");
        System.out.println("1 = adição");
        System.out.println("2 = subtração");
        System.out.println("3 = multiplicação");
        System.out.println("4 = divisão");
        System.out.println("escolha o tipo do caldulo");
        tipoCalculo = sc.nextInt();

        if (tipoCalculo == 1){
            System.out.println("o resultado é " + (num1 + num2));
        }
        else if (tipoCalculo == 2){
            System.out.println("o resultado é " + (num1 - num2));
        }
        else if (tipoCalculo == 3){
            System.out.println("o resultado é " + (num1 * num2));
        }
        else if (tipoCalculo == 4){
            System.out.println("o resultado é " + (num1 / num2));
        }
        else {
            System.out.println(":(");
        }
    }
}
