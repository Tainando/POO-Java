package shopee;

public class perigo {
    private String nome;
    private int preco;

    public perigo(String nome, int preco){
        this.nome = nome;
        this.preco = preco;

    }
    public perigo(){

    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "perigo{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
