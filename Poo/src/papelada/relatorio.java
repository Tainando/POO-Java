package papelada;

abstract class relatorio {
    private String titulo;
    private String DataGeracao;

    public relatorio(String titulo, String DataGeracao){
        this.titulo = titulo;
        this.DataGeracao = DataGeracao;
    }
    public abstract String gerarConteudo();

    public abstract String imprimir();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataGeracao() {
        return DataGeracao;
    }

    public void setDataGeracao(String dataGeracao) {
        DataGeracao = dataGeracao;
    }
}
