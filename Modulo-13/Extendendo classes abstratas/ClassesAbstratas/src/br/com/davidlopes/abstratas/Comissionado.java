package br.com.davidlopes.abstratas;

public class Comissionado extends Empregado{
    private Double totalVenda;
    private Double taxaComissao;

    @Override
    public Double vencimentol() {
        return totalVenda * taxaComissao;
    }

    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public Double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(Double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
}
