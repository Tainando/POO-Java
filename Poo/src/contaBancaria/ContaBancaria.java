package contaBancaria;

public class ContaBancaria {
    private int numeroContaUm;
    private int contaUm;
    private int numeroContaDoesh;
    private int contaDoesh;

    public ContaBancaria(int numeroContaUm, int contaUm, int numeroContaDoesh, int contaDoesh){
        this.numeroContaUm = numeroContaUm;
        this.contaUm = contaUm;
        this.numeroContaDoesh = numeroContaDoesh;
        this.contaDoesh = contaDoesh;
    }
    public ContaBancaria(){

    }

    public int getNumeroContaUm() {
        return numeroContaUm;
    }

    public void setNumeroContaUm(int numeroContaUm) {
        this.numeroContaUm = numeroContaUm;
    }

    public int getContaUm() {
        return contaUm;
    }

    public void setContaUm(int contaUm) {
        this.contaUm = contaUm;
    }

    public int getNumeroContaDoesh() {
        return numeroContaDoesh;
    }

    public void setNumeroContaDoesh(int numeroContaDoesh) {
        this.numeroContaDoesh = numeroContaDoesh;
    }

    public int getContaDoesh() {
        return contaDoesh;
    }

    public void setContaDoesh(int contaDoesh) {
        this.contaDoesh = contaDoesh;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroContaUm=" + numeroContaUm +
                ", contaUm=" + contaUm +
                ", numeroContaDoesh=" + numeroContaDoesh +
                ", contaDoesh=" + contaDoesh +
                '}';
    }
}
