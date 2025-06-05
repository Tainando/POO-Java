package papelada;

public abstract class RelatorioVendas extends relatorio{
    private double totalVendas;
}
public RelatorioVendas(String titulo, String DataGeracao, double totalVendas) {
    super(titulo, DataGeracao);
    this.totalVendas = totalVendas;
}

public String titulo(){
    return ("Relatório de Vendas: Total vendido R$" (totalVendas));
}
