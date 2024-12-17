package br.com.davidlopes.agregacao;
//Agregação Cancelamos a venda porem todos os outros objetos ainda existem.
public class App {
    public static void main(String[] args) {
        Produto produtoTV = criarProduto("TV", 1L, 120D);
        Produto produtoCal = criarProduto("Celular", 23L, 2000D);

        Vendedor vendedor = criarVendedor("David", 10D);

        Comprador comprador = criarComprador("Manel", 2100D);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoCal);
        venda.add(produtoTV);

        venda.concretizarVenda();

        venda.cancelarVenda();

    }

    private static Comprador criarComprador(String nome, double verba) {
        return new Comprador(nome, verba);
    }

    private static Vendedor criarVendedor(String nome, double comicao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comicao);

        return vendedor;
    }

    private static Produto criarProduto(String nome, Long codigo, Double preco) {
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setCodigo(codigo);
        produto.setPreco(preco);

        return produto;
    }
}
