package br.com.davidlopes.anotations.minhasanotacoes;

import java.lang.annotation.Documented;

@PrimeiraAnotacao(value = "David", bairros = {"Centro", "Jardim"})
public class ClasseComAnotacao {

    @PrimeiraAnotacao(value = "David", bairros = {"Centro", "Jardim"})
    private String nome;

    @PrimeiraAnotacao(value = "David", bairros = {"Centro", "Jardim"})
    public ClasseComAnotacao(){

    }
}
