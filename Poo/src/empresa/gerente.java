package empresa;

public class gerente extends  funcionario{
    private int projGerenciado;


    public gerente(String nome, double salarioBase, int projGerenciado){
        super(nome, salarioBase);
        this.projGerenciado = projGerenciado;
    }

    public int getProjGerenciado() {
        return projGerenciado;
    }

    public void setProjGerenciado(int projGerenciado) {
        this.projGerenciado = projGerenciado;
    }

    @Override
    public double calcularBonus() {
        return this.getSalarioBase() * 0.15 + this.getSalarioBase();
    }
}
