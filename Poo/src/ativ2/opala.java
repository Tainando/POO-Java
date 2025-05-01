package ativ2;

public class opala {
    private String nome;
    private String modelo;
    private int ano;


    public opala(String nome, String modelo, int ano){
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }
    public opala(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "opala{" +
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}

