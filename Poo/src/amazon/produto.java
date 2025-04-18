package amazon;

public class produto {
    private String nome;
    private String descricao;
    private int quantEstoque;

    public produto(String nome, String descricao, int quantEstoque){
        this.nome = nome;
        this.descricao = descricao;
        this.quantEstoque = quantEstoque;
    }
    public produto (){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    @Override
    public String toString() {
        return "produto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantEstoque=" + quantEstoque +
                '}';
    }
}
