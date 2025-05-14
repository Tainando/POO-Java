package AtividadeExtra;

import java.util.Scanner;

public class carro {
    static Scanner sc = new Scanner(System.in);
    public static void main (String [] args){
        Veiculos carro1 = new Veiculos();

        System.out.println("Digite o modelo do carro");
        carro1.setModeloVeiculo(sc.next());
        System.out.println("Digite a placa do veiculo");
        carro1.setPlaca(sc.next());
        System.out.println("Digite a Kilometragem do Veiculo");
        carro1.setKM(sc.nextInt());

        System.out.println(carro1.toString());

        Veiculos carro2 = new Veiculos();

        System.out.println("Digite o modelo do carro");
        carro2.setModeloVeiculo(sc.next());
        System.out.println("Digite a placa do veiculo");
        carro2.setPlaca(sc.next());
        System.out.println("Digite a Kilometragem do Veiculo");
        carro2.setKM(sc.nextInt());

        System.out.println(carro2.toString());
    }
}
