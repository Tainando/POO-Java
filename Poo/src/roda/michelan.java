package roda;

public class michelan {
    private String tipo;
    private int aro;
    private int preco;

    public michelan (String tipo, int aro, int preco){
        this.tipo = tipo;
        this.aro = aro;
        this.preco = preco;
    }
    public michelan (){

    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "michelan{" +
                "tipo='" + tipo + '\'' +
                ", aro=" + aro +
                ", preco=" + preco +
                '}';
    }
}
