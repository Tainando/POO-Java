package letra4;

public class numeroD {
    private String nome;
    private int idade;
    private float notaFinal;

    public numeroD(String nome, int idade, float notaFinal){
        this.nome= nome;
        this.idade = idade;
        this.notaFinal = notaFinal;
    }
    public numeroD(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "numeroD{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", notaFinal=" + notaFinal +
                '}';
    }
}
