package Veiculos;

public abstract class Busao extends transporte{
    private int quantcabeBusao;

    public Busao(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel, int quantcabeBusao){
        super(nome,  velocidadeMaxima, autonomia,tipoDeCombustivel);
        this.quantcabeBusao = quantcabeBusao;
    }// aqui é uma classe unica para a subclasse Busão, como num obj "quantidade que cabe no onibus"

    public int getquantcabeBusao() {
        System.out.println("quantos cabe no Onibus?");
        return quantcabeBusao;
    }

    public void setquantcabeBusao(int quantcabeBusao) {
        this.quantcabeBusao = quantcabeBusao;
    }


    public String mover() {
        return ("o Busão esta andando");
    }//aqui é pra indicar a ação da classe
    public String parar(){
        return ("o Busão esta parado");//aqui é pra indicar a ação da classe
    }
    @Override
    public void exibirInformacoes(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        System.out.println("O nome da moto é" + this.getNome()+ "a velocidade da moto:" +this.getVelocidadeMaxima()+ "a autonomia da moto é" +this.getAutonomia()+"e o tipo do combustivel é" + this.getTipoDeCombustivel() + ".");;
    }// aqui é para salvar as informações da subclasse
}