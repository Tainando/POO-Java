package shopee;

public class perigo {
    private String nome;
    private int preco;
    private int quantEstoque;

    public perigo(String nome, int preco, int quantEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;

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

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    @Override
    public String toString() {
        return "perigo{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantEstoque=" + quantEstoque +
                '}';
    }
}
