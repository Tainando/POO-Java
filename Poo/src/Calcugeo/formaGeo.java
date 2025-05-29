package Calcugeo;

public abstract class formaGeo {
    private String cor;


    formaGeo(String cor){
        this.cor = cor;
    }

    public abstract double calcularPerimetro();

    public abstract double calculoArea();

<<<<<<< HEAD
    public abstract double calcularVolume();
=======
    public double calcularVolume(){
        System.out.println("invalido");
        return 0.0;
    }

>>>>>>> b29ca5547dd9c23a87f8de3f23341bc0ed41cae7
}
