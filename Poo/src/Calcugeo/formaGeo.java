package Calcugeo;

public abstract class formaGeo {
    private String cor;

    formaGeo(String cor){
        this.cor = cor;
    }

    public abstract double calcularPerimetro();

    public abstract double calculoArea();

    public abstract double calcularVolume();
}
