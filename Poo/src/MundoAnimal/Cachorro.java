package MundoAnimal;

public abstract class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, int idade, String raca){
    super(nome, idade);
    this.raca = raca;
    }
    public String getRaca(){
        return raca;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public String emitirSom() {
        return ("au au");
    }
    public String comer(){
        return ("o cahorro come ração");
    }
    @Override
    public void exibirinformaoees(String nome, int idade) {
        System.out.println("O nome do cachorro é" + this.getNome()+ "a idade do cachorro é:" +this.getIdade()+ "e a raça do cachorro é" +raca+".");;
    }
}