package br.com.davidlopes.composicao;

public class ContaCorrente {
    private Long numeroCC;
    private Double digito;
    private Banco banco;
    private Double saldo;
    private Double chequeEspecial;

    public ContaCorrente(Long cc, Double dg, Double saldo) {
        this.numeroCC = cc;
        this.digito = dg;
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Long getNumeroCC() {
        return numeroCC;
    }

    public void setNumeroCC(Long numeroCC) {
        this.numeroCC = numeroCC;
    }

    public Double getDigito() {
        return digito;
    }

    public void setDigito(Double digito) {
        this.digito = digito;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "banco=" + banco +
                '}';
    }

    public void ifConta(){
        System.out.println("Conta: " + this.numeroCC +
                " Digito: " + this.digito +
                " Saldo: " + this.saldo +
                " Banco: "  + toString()
        );
    }
}
