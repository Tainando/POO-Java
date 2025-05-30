package empresa;

public class estagiario extends funcionario{
    private int horasEstagio;

    public estagiario(String nome, double salarioBase, int horasEstagio){
        super(nome,salarioBase);
        this.horasEstagio = horasEstagio;
    }

    public int getHorasEstagio() {
        return horasEstagio;
    }

    public void setHorasEstagio(int horasEstagio) {
        this.horasEstagio = horasEstagio;
    }
    public double calcularBonus(){
        return this.getSalarioBase() * 0.05 + this.getSalarioBase();
    }
}


