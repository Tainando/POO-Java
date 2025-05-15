package AtividadeExtra;

public class Biblioteca {
    private String tituLivro;
    private String Autor;
    private int AnoPubli;

    public Biblioteca(String tituLivro, String Autor, int AnoPubli) {
        this.tituLivro = tituLivro;
        this.Autor = Autor;
        this.AnoPubli = AnoPubli;

    }

    public Biblioteca() {

    }

    public String getTituLivro() {
        return tituLivro;
    }

    public void setTituLivro(String tituLivro) {
        this.tituLivro = tituLivro;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getAnoPubli() {
        return AnoPubli;
    }

    public void setAnoPubli(int anoPubli) {
        AnoPubli = anoPubli;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "tituLivro='" + tituLivro + '\'' +
                ", Autor='" + Autor + '\'' +
                ", AnoPubli='" + AnoPubli + '\'' +
                '}';
    }
}