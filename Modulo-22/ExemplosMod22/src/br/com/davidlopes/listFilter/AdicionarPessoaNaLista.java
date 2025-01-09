package br.com.davidlopes.listFilter;

import br.com.davidlopes.meusexemplos.model.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AdicionarPessoaNaLista {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().popularPessoas();
        List<Pessoa> brasileiros = new ArrayList<>();
        List<Pessoa> mexicanos = new ArrayList<>();

        // Opção 1 - Usando expressão lambda diretamente no filter e forEach para adcionar ao grupo de brasileiros

        pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .forEach(pessoa -> brasileiros.add(pessoa));
        System.out.println("Lista de Brasileiros" + "\n" + brasileiros);

        // Opção 2 - Usando Predicate e forEach para imprimir
        Predicate<Pessoa> predi1 = pessoa -> pessoa.getNacionalidade().equals("Mexico");
        pessoas.stream()
                .filter(predi1)
                .forEach(pessoa ->  mexicanos.add(pessoa));
        System.out.println("Lista de Mexicanos" + "\n" + mexicanos);
    }
}
