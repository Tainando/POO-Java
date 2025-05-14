package AtividadeExtra;

public class Veiculos {
    private String modeloVeiculo;
    private String Placa;
    private float KM;

    public Veiculos(String modeloVeiculo, String Placa, float KM){
        this.modeloVeiculo = modeloVeiculo;
        this.Placa = Placa;
        this.KM = KM;
    }
    public Veiculos(){

    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public float getKM() {
        return KM;
    }

    public void setKM(float KM) {
        if (KM < 0) {
            System.out.println("kilometragem não autorizada");
            this.KM = KM;
        }
    }
    @Override
    public String toString() {
        return "Veiculos{" +
                "modeloVeiculo='" + modeloVeiculo + '\'' +
                ", Placa='" + Placa + '\'' +
                ", KM=" + KM +
                '}';
    }
}
