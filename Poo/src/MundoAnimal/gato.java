package MundoAnimal;

public abstract class gato extends Animal{
    private String corPelo;

    public gato(String nome, int idade, String corPelo){
        super(nome, idade);
        this.corPelo = corPelo;
    }
    public String getCorPelo(){
        return corPelo;
    }
    public void setCorPelo(String corPelo){
        this.corPelo = corPelo;
    }
    public String emitirSom() {
        return ("Miau");
    }
    public String comer(){
        return ("o gato come peixe");
    }
    @Override
    public void exibirinformaoees(String nome, int idade) {
        System.out.println("O nome do gato é" + this.getNome()+ "a idade do gato é:" +this.getIdade()+ "e a cor do pelo do gato é" +corPelo+".");;
    }
}