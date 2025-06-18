package Veiculos;

import org.w3c.dom.ls.LSOutput;

public abstract class Moto extends transporte{
    private int pesoMoto;

    public Moto(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel, int pesoMoto){
        super(nome,  velocidadeMaxima, autonomia,tipoDeCombustivel);
        this.pesoMoto = pesoMoto;
    }// aqui é uma classe unica para a subclasse moto, como num obj "peso da moto"

    public int getpesoMoto() {
        System.out.println("quanto pesa a moto?");
        return pesoMoto;
    }

    public void setpesoMoto(int pesoMoto) {
        this.pesoMoto = pesoMoto;
    }



    public String mover() {
        return ("a moto esta andando");
    }//aqui é pra indicar a ação da classe
    public String parar(){
        return ("o motoca caiu  esta parado");//aqui é pra indicar a ação da classe
    }
    @Override
    public void exibirInformacoes(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        System.out.println("O nome da moto é" + this.getNome()+ "a velocidade da moto:" +this.getVelocidadeMaxima()+ "a autonomia da moto é" +this.getAutonomia()+"e o tipo do combustivel é" + this.getTipoDeCombustivel() + ".");;
    }// aqui é para salvar as informações da subclasse
}