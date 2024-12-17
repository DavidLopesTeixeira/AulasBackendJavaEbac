package br.com.davidlopes.composicao;

public class ContaPoupanca {
    private Long numeroCP;
    private Double digito;
    private Banco banco;
    private Double saldo;

    public ContaPoupanca(Long cp, Double dg, Double saldo) {
        this.numeroCP = cp;
        this.digito = dg;
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Long getNumeroCP() {
        return numeroCP;
    }

    public void setNumeroCP(Long numeroCP) {
        this.numeroCP = numeroCP;
    }

    public Double getDigito() {
        return digito;
    }

    public void setDigito(Double digito) {
        this.digito = digito;
    }

    @Override
    public String toString() {
        return "Conta Poupança{" +
                "banco=" + banco +
                '}';
    }

    public void ifConta(){
        System.out.println("Conta: " + this.numeroCP +
                " Digito: " + this.digito +
                " Saldo: " + this.saldo +
                " Banco: "  + toString()
        );
    }
}
