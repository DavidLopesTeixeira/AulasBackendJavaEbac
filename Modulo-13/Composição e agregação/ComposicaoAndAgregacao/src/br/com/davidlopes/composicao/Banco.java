package br.com.davidlopes.composicao;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private String nome;
    private Long codigo;
    private Set<ContaCorrente> contasCorrentes;
    private Set<ContaPoupanca> contasPupancas;

    public Banco(){
        //HashSet é uma coleção de itens onde cada item é único e pode ser encontrado
        this.contasCorrentes = new HashSet<>();
        this.contasPupancas = new HashSet<>();
    }

    // Metodos para adicionar as insformações na lista
    public void add(ContaCorrente cc){
        this.contasCorrentes.add(cc);
    }

    public void add(ContaPoupanca cp){
        this.contasPupancas.add(cp);
    }

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

    public ContaCorrente abrirContaCC(Long cc, Double dg, Double saldo){
        return new ContaCorrente(cc, dg, saldo);
    }

    public ContaPoupanca abrirContaCp(Long cp, Double dg, Double saldo){
        return new ContaPoupanca(cp,dg, saldo);
    }

    private void falir(){
        this.contasPupancas = null;
        this.contasCorrentes = null;
        System.out.println("O banco faliu");
    }
}
