package br.com.davidlopes.agregacao;

public class Produto {
    private String nome;
    private Long codigo;
    private Double preco;

    public void vendido(){
        System.out.println("Vendido");
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
