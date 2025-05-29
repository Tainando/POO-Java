package empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class folhadePagamento {
    static Scanner sc = new Scanner(System.in);
    private static String List;

    public static void main(String [] args){
        List<funcionario> QuadroFuncionario = new ArrayList<>();

        QuadroFuncionario.add(new gerente("pedro", 10000.00,  15));
        QuadroFuncionario.add(new desenvolvedor("roberta", 5000, "javaScript"));
        QuadroFuncionario.add(new estagiario("carlo", 3500, 6));
        System.out.println("elementos cara de pau" + List);

        for (QuadroFuncionario q : quadroFuncionario){
            System.out.println("nome" + q.getNome() + "bonus: " + q.calcularBonus());
        }
    }
}
