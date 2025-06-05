package empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class folhadePagamento {
    static Scanner sc = new Scanner(System.in);
    private static String List;
    public static void main(String [] args){
        List<funcionario> funcionario = new ArrayList<>();

        funcionario.add(new gerente("pedro", 10000.00,  15));
        funcionario.add(new desenvolvedor("roberta", 5000, "javaScript"));
        funcionario.add(new estagiario("carlo", 3500, 6));
        System.out.println("elementos cara de pau:" + List);

        for (funcionario c : funcionario){
            System.out.println("nome:" + c.getNome() + "- bonus: " + c.calcularBonus());
        }
    }
}
