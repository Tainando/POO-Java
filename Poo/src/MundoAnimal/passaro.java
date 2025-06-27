package MundoAnimal;

public abstract class passaro extends Animal{
    private String corPenas;

    public passaro(String nome, int idade, String corPenas){
        super(nome, idade);
        this.corPenas = corPenas;
    }
    public String getCorPenas(){
        return corPenas;
    }
    public void setCorPenas(String corPelo){
        this.corPenas = corPenas;
    }
    public String emitirSom() {
        return ("Piu Piu");
    }
    public String comer(){
        return ("o gato come semente");
    }
    @Override
    public void exibirinformaoees(String nome, int idade) {
        System.out.println("O nome do passaro é" + this.getNome()+ "a idade do passaro é:" +this.getIdade()+ "e a cor das penas do passaro é" +corPenas+".");;
    }
}