package empresa;

public class desenvolvedor extends funcionario{
    private String linguagemFavorita;

    public desenvolvedor(String nome, double salarioBase, String linguagemFavorita){
        super(nome,salarioBase);
        this.linguagemFavorita = linguagemFavorita;
    }

    public String getLinguagemFavorita() {
        return linguagemFavorita;
    }

    public void setLinguagemFavorita(String linguagemFavorita) {
        this.linguagemFavorita = linguagemFavorita;
    }
    public double calcularBonus(){
        return this.salarioBonus() * 0.10;
    }
}
