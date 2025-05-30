package Calcugeo;

public class quadrado extends formaGeo{
    private double lado;

    public quadrado(String cor, double lado){
        super(cor);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculoArea() {
        return this.lado * this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado * 4;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(this.lado, 3);// lado^3
    }
}