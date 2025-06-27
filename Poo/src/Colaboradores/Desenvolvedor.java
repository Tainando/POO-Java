package Colaboradores;

public class Desenvolvedor extends Funcionarios{
    public Desenvolvedor(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.15 + getSalario();
    }
    @Override
    public String exibirCargo(){
        return "cargo de Dev";
    }
    public void MostrarInformacoes(){
        System.out.println("o nome do Desenvolvedor é" + getNome() + "o cpf do Desenvolvedor é"
                + getCpf() + "o salario do Desenvolvedor é" + calcularBonus() + ".");
    }

}
