package br.com.davidlopes;

import br.com.davidlopes.abstratas.Assalariado;
import br.com.davidlopes.abstratas.Comissionado;
import br.com.davidlopes.abstratas.Empregado;
import br.com.davidlopes.abstratas.Horista;

public class App {
    public static void main(String[] args) {
        Assalariado assalariado = new Assalariado();
        assalariado.setNome("David");
        assalariado.setSobrenome("Lopes");
        assalariado.setCpf("1");
        assalariado.setSalario(5000d);
        Double vencimentos = assalariado.vencimentol();
        imprimir(assalariado);

        Comissionado comissionado = new Comissionado();
        comissionado.setNome("Fulano");
        comissionado.setSobrenome("de Tal");
        comissionado.setCpf("2");
        comissionado.setTotalVenda(10000d);
        comissionado.setTaxaComissao(0.1d);
        imprimir(comissionado);

        Horista taxa = new Horista();
        taxa.setNome("Daniela");
        taxa.setSobrenome("Lopes");
        taxa.setCpf("3");
        taxa.setPrecoHora(15d);
        taxa.setTotalHorasTrabalhadas(8d);
        imprimir(taxa);


    }

    public static void imprimir(Empregado empregado){
        String tipo = "";
        if(empregado instanceof  Assalariado){
        tipo = "CLT";
        } else if (empregado instanceof  Comissionado) {
            tipo = "Comissionado";
        } else{
            tipo = "Taxa";
        }

        System.out.println(tipo + " Nome: "
        + empregado.getNome() + " Do CPF: " +
                empregado.getCpf() + " recebeu os valores de: " +
                empregado.vencimentol());
    }

}
