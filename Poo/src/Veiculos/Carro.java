package Veiculos;

public abstract class Carro extends transporte{
    private int QuantPortas;

    public Carro(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel, int QuantPortas){
        super(nome,  velocidadeMaxima, autonomia,tipoDeCombustivel);
        this.QuantPortas = QuantPortas;
    }// aqui é uma classe unica para a subclasse carro, como num obj "quantidade de porta"

    public int getQuantPortas() {
        System.out.println("quantas portas tem o carro?");
        return QuantPortas;
    }

    public void setQuantPortas(int quantPortas) {
        this.QuantPortas = quantPortas;
    }


    public String mover() {
        return ("o carro esta andando");
    }//aqui é pra indicar a ação da classe
    public String parar(){
        return ("o carro esta parado");//aqui é pra indicar a ação da classe
    }
    @Override
    public void exibirInformacoes(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        System.out.println("O nome do carro é" + this.getNome()+ "a velocidade do carro é:" +this.getVelocidadeMaxima()+ "a autonomia do carro é" +this.getAutonomia()+"e o tipo do combustivel é" + this.getTipoDeCombustivel() + ".");;
    }// aqui é para salvar as informações da subclasse
}