package br.com.davidlopes.composicao;

public class App {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setCodigo(12L);
        banco.setNome("Banco do Brasil");

        ContaCorrente cc = new ContaCorrente(1225L, 54D, 8600D);
        cc.setBanco(banco);

        ContaPoupanca cp = new ContaPoupanca(54789L,54D, 133D);
        cp.setBanco(banco);

        cc.ifConta();
        System.out.println("");
        cp.
        cp.ifConta();
    }


}
