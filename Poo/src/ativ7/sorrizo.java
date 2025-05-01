package ativ7;

public class sorrizo {
    private String rua;
    private int numero;
    private String cidade;

    public sorrizo(String rua, int numero, String cidade){
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }
    public sorrizo(){

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "sorrizo{" +
                "rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
