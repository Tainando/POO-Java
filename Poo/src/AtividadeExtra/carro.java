package AtividadeExtra;

import java.util.ArrayList;
import java.util.Scanner;

public class carro {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Veiculos> veiculos = new ArrayList<>();

        for (int contador = 0; contador <= 6; contador++) {
            Veiculos carro = new Veiculos();
            System.out.println("Digite o modelo do carro");
            carro.setModeloVeiculo(sc.next());
            System.out.println("Digite a placa do veiculo");
            carro.setPlaca(sc.next());

            while (carro.getKM() <= 0){
                System.out.println("digite a kilometragem do veiculo");
                carro.setKM(sc.nextFloat());
                System.out.println("kilometragem invalida");
                carro.setKM(sc.nextFloat());

            }

          System.out.println(carro.toString());
        }

    }
}
