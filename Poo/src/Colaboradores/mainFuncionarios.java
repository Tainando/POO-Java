package Colaboradores;

import java.util.Scanner;

public class mainFuncionarios {
     static Scanner sc = new Scanner(System.in);
     public static void main(String[] args) {
         Funcionarios admin = new admin("", "", 0);
         System.out.println("qual é o seu nome");
         admin.setNome(sc.next());
         System.out.println("qual é o seu cpf");
         admin.setCpf(sc.next());
         System.out.println("qual é o seu salario");
         admin.setSalario(sc.nextDouble());
         admin.MostrarInformacoes();
         admin.calcularBonus();

         Funcionarios desenvolvedor = new Desenvolvedor("","",0);
         System.out.println("qual é o seu nome");
         desenvolvedor.setNome(sc.next());
         System.out.println("qual é o seu cpf");
         desenvolvedor.setCpf(sc.next());
         System.out.println("qual é o seu salario");
         admin.setSalario(sc.nextDouble());
         desenvolvedor.MostrarInformacoes();
         desenvolvedor.calcularBonus();

         Funcionarios suporteTecnico = new Desenvolvedor("","",0);
         System.out.println("qual é o seu nome");
         suporteTecnico.setNome(sc.next());
         System.out.println("qual é o seu cpf");
         suporteTecnico.setCpf(sc.next());
         System.out.println("qual é o seu salario");
         suporteTecnico.setSalario(sc.nextDouble());
         suporteTecnico.MostrarInformacoes();
         suporteTecnico.calcularBonus();
     }
}

