package Veiculos;

abstract class transporte {
    private String nome;
    private int velocidadeMaxima;
    private int autonomia;
    private String tipoDeCombustivel;
    // classes acima vai ser definida como padrão entre as subclasses //

    public transporte(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        this.nome = nome;
        this.velocidadeMaxima =velocidadeMaxima;
        this.autonomia = autonomia;
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public abstract String mover();// aqui para exibir a ação do veiculo
    public abstract String parar();// a mesma coisa do comentario a cima

    public void exibirInformacoes (String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel){
        System.out.println("o nome do veiculo é:" + nome +
                "a velocidade maxima que pode atingir é:" + velocidadeMaxima +
                "a a quatidade de vezez que o veiculo pode andar antes de abatecer é de:" + autonomia +
                "e o tipo do combustivel do veiculo é:" + tipoDeCombustivel + ".");// aqui é para exibir informaçõe das subclasses
    }
}
