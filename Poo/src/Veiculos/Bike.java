package Veiculos;

public abstract class Bike extends transporte{
    private int modificacoes;

    public Bike(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel, int modificacoes){
        super(nome,  velocidadeMaxima, autonomia,tipoDeCombustivel);
        this.modificacoes = modificacoes;
    }// aqui é uma classe unica para a subclasse bike, como num obj "modificações"

    public int getModificacoes() {
        System.out.println("quantos vez a bike foi modificade?");
        return modificacoes;
    }

    public void setModificacoes(int modificacoes) {
        this.modificacoes = modificacoes;
    }


    public String mover() {
        return ("a bike esta empinado esta andando");
    }//aqui é pra indicar a ação da classe
    public String parar(){
        return ("a bike parou de empinar");//aqui é pra indicar a ação da classe
    }
    @Override
    public void exibirInformacoes(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        System.out.println("O nome da moto é" + this.getNome()+ "a velocidade da moto:" +this.getVelocidadeMaxima()+ "a autonomia da moto é" +this.getAutonomia()+"e o tipo do combustivel é" + this.getTipoDeCombustivel() + ".");;
    }// aqui é para salvar as informações da subclasse
}