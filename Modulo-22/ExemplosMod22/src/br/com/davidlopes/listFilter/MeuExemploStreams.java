package br.com.davidlopes.listFilter;

import br.com.davidlopes.meusexemplos.model.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MeuExemploStreams {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().popularPessoas();
        List<Pessoa> brasillleiros = new ArrayList<>();

        // Opção 1 -mais indicada - Usando expressão lambda diretamente no filter e forEach para imprimir

        System.out.println("Brasileiros");
        pessoas.stream()
                //Filtrando pessoas que seja do brasil
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                // Iterando sob cada pessoa que retorna do filtro

                .forEach(pessoa -> brasillleiros.add(pessoa));

        // Opção 2 - Usando Predicate e forEach para imprimir
        System.out.println("Mexicanos");
        Predicate<Pessoa> predi1 = pessoa -> pessoa.getNacionalidade().equals("Mexico");
        pessoas.stream()
                .filter(predi1)
                .forEach(pessoa -> System.out.println(pessoa));

        // Opção 3 - Usando uma classe anônima para Predicate e forEach
        Predicate<Pessoa> predi2 = new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa pessoa) {
                return pessoa.getNacionalidade().equals("Canada");
            }
        };
        System.out.println("Canadenses");
        pessoas.stream()
                .filter(predi2)
                .forEach(pessoa -> System.out.println(pessoa));

    }
}
