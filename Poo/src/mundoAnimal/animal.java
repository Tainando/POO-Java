package mundoAnimal;

public class animal {
    private String tipo;
    private String nomeAnimal;
    private String raca;
    private int idade;

    public animal ( String tipo, String nomeAnimal, String raca, int idade){
        this.tipo = tipo;
        this.nomeAnimal = nomeAnimal;
        this.raca = raca;
        this.idade = idade;
    }
    public animal(){

    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "animal{" +
                "tipo='" + tipo + '\'' +
                ", nomeAnimal='" + nomeAnimal + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                '}';
    }
}
