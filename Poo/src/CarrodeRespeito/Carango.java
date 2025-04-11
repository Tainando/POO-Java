package CarrodeRespeito;

public class Carango {
    private int quantidadeRodas;
    private String chassi;
    private String marca;
    private String tipo;


    public Carango(int quantidadeRodas,String numChassi,String marca, String tipo ){
        this.quantidadeRodas = quantidadeRodas;
        this.chassi = numChassi;
        this.marca = marca;
        this.tipo = tipo;
    }
    public Carango(){

    }
    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }
    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Carango{" +
                "quantidadeRodas=" + quantidadeRodas +
                ", chassi='" + chassi + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
