package cliente;

public class atedimento {
    private String nomeCliente;
    private float CPF;
    private String Email;

    public atedimento(String nomeCliente, float CPF, String email){
        this.nomeCliente = nomeCliente;
        this.CPF = CPF;
        this.Email = email;
    }
    public atedimento(){

    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getCPF() {
        return CPF;
    }

    public void setCPF(float CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "atedimento{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", CPF=" + CPF +
                ", Email='" + Email + '\'' +
                '}';
    }
}
