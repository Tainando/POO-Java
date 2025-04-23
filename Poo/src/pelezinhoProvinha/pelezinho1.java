package pelezinhoProvinha;

public class pelezinho1 {
    private String nome;
    private int matricula;
    private float salario;


    public pelezinho1(String nome, int matricula, float salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public pelezinho1(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "pelezinho1{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", salario=" + salario +
                '}';
    }
}