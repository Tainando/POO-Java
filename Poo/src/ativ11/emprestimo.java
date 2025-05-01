package ativ11;

public class emprestimo {
    private int valor;
    private int dataEmprestimo;
    private int numPracelas;

    public emprestimo(int valor,int dataEmprestimo, int numPracelas){
        this.valor = valor;
        this.dataEmprestimo = dataEmprestimo;
        this.numPracelas = numPracelas;
    }
    public emprestimo(){

    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(int dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getNumPracelas() {
        return numPracelas;
    }

    public void setNumPracelas(int numPracelas) {
        this.numPracelas = numPracelas;
    }

    @Override
    public String toString() {
        return "emprestimo{" +
                "valor=" + valor +
                ", dataEmprestimo=" + dataEmprestimo +
                ", numPracelas=" + numPracelas +
                '}';
    }
}
