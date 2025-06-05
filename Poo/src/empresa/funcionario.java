package empresa;

public class funcionario {
    private String nome;
    private double salarioBase;

    public funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public double calcularBonus(){
        System.out.println("salario invalido");
        return 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


}