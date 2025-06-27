package Colaboradores;

public class admin extends Funcionarios{
    public admin(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.10 + getSalario();
    }
    public String exibirCargo(){
        return "cargo de adm";
    }
    public void MostrarInformacoes(){
        System.out.println("o nome do Administrador é" + getNome() + "o cpf do Administrador é"
                + getCpf() + "o salario do Administrador é" + calcularBonus() + ".");
    }
}
