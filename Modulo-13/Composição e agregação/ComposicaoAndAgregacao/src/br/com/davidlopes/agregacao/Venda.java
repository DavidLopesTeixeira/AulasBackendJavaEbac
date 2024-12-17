package br.com.davidlopes.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Comprador comprador;
    private Vendedor vendedor;
    private List<Produto> produtos;

    public Venda(){
        this.produtos = new ArrayList<>();
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void add(Produto produto){
        this.produtos.add((produto));
    }

    public void concretizarVenda(){
        Double verba  = comprador.getVerba();
        Double total = 0.0D;
        System.out.println("Comprador: " + this.comprador.getNome());
        System.out.println("Comprou os itens");

        for(Produto prod : this.produtos){

            total = total + prod.getPreco();
            if(verba >= total){
                System.out.println("Nome produto: " + prod.getNome() +
                        " Código: " +
                        prod.getCodigo() +
                        " Preço: " + prod.getPreco());
                System.out.println("TOTAL = " + total);

                System.out.println("");
            } else{
                System.out.println("O cliente: " + comprador.getNome() +  " não tem saldo suficiente para comprar os seguintes produtos" );
                System.out.println("Produto nome: " + prod.getNome() + " Preco: " + prod.getPreco());

            }
        }
        System.out.println("Vendedor: " + this.vendedor.getNome());

    }

    public void cancelarVenda(){
        System.out.println("Venda cancelada!");
        //Agregação Cancelamos a venda porem todos os outros objetos ainda existem.
        this.produtos = null;
        System.out.println("Podutos " + produtos );
    }
}
