package Calcugeo;

public class circulo extends formaGeo{
    private double raio;

    public circulo (String cor, double raio){
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double calculoArea(){
        return this.raio * 3.14;
    }

    public double calcularPerimetro() {
        return this.raio * 2 * 3.14;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(4 * 3.14 * this.raio, 3) / 3;
    }
}
