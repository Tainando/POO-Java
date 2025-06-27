package MundoAnimal;

abstract class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
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
    public abstract String emitirSom();

    public abstract String comer();

    public void exibirinformaoees(String nome, int idade){
        System.out.println("o nome do animal é:" + nome + "e a idade do animal é:" + idade + ".");;
    }
}