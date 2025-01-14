package br.com.davidlopes.optional;

import br.com.davidlopes.model.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExemplosOptional {
    public static void main(String[] args) {
        // Optional e simples e serve para evitar um null pointer

        List<Pessoa> lista = new Pessoa().popularPessoas();

        Optional<Pessoa> max = lista.stream()
                .max(Comparator.comparing(Pessoa::getIdade)); // pegando as pessoas com mais idade
        if(max.isPresent()) {
            System.out.println(max.get()); // nos retornou a pessoa david com 31 anos
        }
    }
}
