package Colaboradores;

public class SuporteTecnico extends Funcionarios{
    public SuporteTecnico(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.08 + getSalario();
    }
    @Override
    public String exibirCargo(){
        return "cargo de Suporte";
    }
    public void MostrarInformacoes(){
        System.out.println("o nome do Suporte Tecnico é" + getNome() + "o cpf do Suporte Tecnico é"
                + getCpf() + "o salario do Suporte Tecnico é" + calcularBonus() + ".");
    }
}

