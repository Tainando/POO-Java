package MundoAnimal;

import ativ6.animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class selecaoNatural {
    static Scanner sc = new Scanner(System.in);
    private static String List;
    public static void main(String [] args){
        List<Animal> animal = new ArrayList<>();

        animal.add(new Cachorro("pitico", 7, "vira-lata") {
            @Override
            public String getRaca() {
                return super.getRaca();
            }

            @Override
            public void setRaca(String raca) {
                super.setRaca(raca);
            }

            @Override
            public String emitirSom() {
                return super.emitirSom();
            }

            @Override
            public String comer() {
                return super.comer();
            }

            @Override
            public void exibirinformaoees(String nome, int idade) {
                super.exibirinformaoees(nome, idade);
            }
        });
        animal.add(new gato("Toco", 5, "Laranja") {
            @Override
            public String getCorPelo() {
                return super.getCorPelo();
            }

            @Override
            public void setCorPelo(String corPelo) {
                super.setCorPelo(corPelo);
            }

            @Override
            public String emitirSom() {
                return super.emitirSom();
            }

            @Override
            public String comer() {
                return super.comer();
            }

            @Override
            public void exibirinformaoees(String nome, int idade) {
                super.exibirinformaoees(nome, idade);
            }
        });
        animal.add(new passaro("Piu Piu", 2, "amarelo") {
            @Override
            public String getCorPenas() {
                return super.getCorPenas();
            }

            @Override
            public void setCorPenas(String corPelo) {
                super.setCorPenas(corPelo);
            }

            @Override
            public String emitirSom() {
                return super.emitirSom();
            }

            @Override
            public String comer() {
                return super.comer();
            }

            @Override
            public void exibirinformaoees(String nome, int idade) {
                super.exibirinformaoees(nome, idade);
            }
        });
        System.out.println("\n--- Exibindo informações gerais de todos os animais ---");
        for (Animal a : animal) {
            System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade() + ", Som: " + a.emitirSom() + ", Comida: " + a.comer());
        }

    }
}