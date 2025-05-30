package Calcugeo;

public class Retangulo extends formaGeo{
    private double largura;
    private double altura;
    private double comprimento;

    public Retangulo (String cor, double largura, double altura, double comprimento){
    super(cor);
    this.altura = altura;
    this.largura = largura;
    this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public double calcularPerimetro() {
        return (this.largura + this.altura) * 2;
    }

    @Override
    public double calculoArea() {
        return this.largura * this.altura;
    }

    @Override
    public double calcularVolume() {
        return (this.largura * this.comprimento) * this.altura;
    }
}

