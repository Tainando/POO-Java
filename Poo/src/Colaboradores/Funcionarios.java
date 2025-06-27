package Colaboradores;

abstract class Funcionarios {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionarios(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public abstract double calcularBonus();
    public abstract String exibirCargo();

    public void MostrarInformacoes(){
        System.out.println("o nome do funcionario é" + nome + "o cpf do funcionario é" + cpf + "o salario do funcionario é" + salario + ".");
    }
}
