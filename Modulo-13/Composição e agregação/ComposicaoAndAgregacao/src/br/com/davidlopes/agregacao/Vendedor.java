package br.com.davidlopes.agregacao;

public class Vendedor {
    private Double comissao;
    String nome;

    public void vende(){
        System.out.println("Vender");
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
