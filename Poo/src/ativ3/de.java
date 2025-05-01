package ativ3;

public class de {
    private String titulo;
    private String autor;
    private int datalancamento;

    public de (String titulo, String autor, int datalancamento){
        this.autor = autor;
        this.titulo = titulo;
        this.datalancamento = datalancamento;
    }
    public de(){

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDatalancamento() {
        return datalancamento;
    }

    public void setDatalancamento(int datalancamento) {
        this.datalancamento = datalancamento;
    }

    @Override
    public String toString() {
        return "de{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", datalancamento=" + datalancamento +
                '}';
    }
}
