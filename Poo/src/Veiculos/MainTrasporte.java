package Veiculos;

import ativ6.animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTrasporte {
    static Scanner sc = new Scanner(System.in);
    private static String List;
    public static void main(String [] args) {
        List<transporte> Transportes = new ArrayList<>();

        Transportes.add(new Carro("opala", 90, 50, "gasolina", 4) {
            @Override
            public int getQuantPortas() {
                return super.getQuantPortas();
            }

            @Override
            public void setQuantPortas(int quantPortas) {
                super.setQuantPortas(quantPortas);
            }

            @Override
            public String mover() {
                return super.mover();
            }

            @Override
            public String parar() {
                return super.parar();
            }

            @Override
            public void exibirInformacoes(String nome, int velocidadeMaxima, int autonomia, String tipoGasolina) {
                super.exibirInformacoes(nome, velocidadeMaxima, autonomia, tipoGasolina);
            }

        });
        Transportes.add(new Moto("Kawazaqui ", 300, 100, "gasolina", 200) {


            @Override
            public int getpesoMoto() {
                return super.getpesoMoto();
            }

            @Override
            public void setpesoMoto(int pesoMoto) {
                super.setpesoMoto(pesoMoto);
            }

            @Override
            public String mover() {
                return super.mover();
            }

            @Override
            public String parar() {
                return super.parar();
            }

            @Override
            public void exibirInformacoes(String nome, int velocidadeMaxima, int autonomia, String tipoGasolina) {
                super.exibirInformacoes(nome, velocidadeMaxima, autonomia, tipoGasolina);
            }
        });
        Transportes.add(new Busao("Mercedes ", 120, 70, "Diesel", 35) {
            @Override
            public int getquantcabeBusao() {
                return super.getquantcabeBusao();
            }

            @Override
            public void setquantcabeBusao(int quantcabeBusao) {
                super.setquantcabeBusao(quantcabeBusao);
            }

            @Override
            public String mover() {
                return super.mover();
            }

            @Override
            public String parar() {
                return super.parar();
            }

            @Override
            public void exibirInformacoes(String nome, int velocidadeMaxima, int autonomia, String tipoGasolina) {
                super.exibirInformacoes(nome, velocidadeMaxima, autonomia, tipoGasolina);
            }
        });
        Transportes.add(new Bike("Caloi Cross", 60, 999999999, "inderteminado", 10) {
            @Override
            public int getModificacoes() {
                return super.getModificacoes();
            }

            @Override
            public void setModificacoes(int modificacoes) {
                super.setModificacoes(modificacoes);
            }

            @Override
            public String mover() {
                return super.mover();
            }

            @Override
            public String parar() {
                return super.parar();
            }

            @Override
            public void exibirInformacoes(String nome, int velocidadeMaxima, int autonomia, String tipoGasolina) {
                super.exibirInformacoes(nome, velocidadeMaxima, autonomia, tipoGasolina);
            }
        });

        System.out.println("\n--- Exibindo informações gerais de todos os veiculos ---");
        for (transporte t : Transportes) {
            System.out.println("Nome: " + t.getNome() + ", velocidade: " + t.getVelocidadeMaxima() + ", Som: " + t.getAutonomia() + ", Comida: " + t.getTipoDeCombustivel());
        }
    }
}
