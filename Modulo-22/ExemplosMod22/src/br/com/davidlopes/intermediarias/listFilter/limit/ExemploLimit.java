package br.com.davidlopes.intermediarias.listFilter.limit;

import br.com.davidlopes.model.Pessoa;

import java.util.List;
import java.util.stream.Stream;

public class ExemploLimit {
    public static void main(String[] args) {
        // O método limit é utilizado para limitar o número de elementos em uma stream.
        // É uma operação conhecida como curto-circuito devido ao fato de não precisar processar todos
        // os elementos. Como exempo o código a seguir demostra como retorna uma stream
        // com apenas os dois primeiros elementos

        //Essa lista continua com 4 pessoas
        List<Pessoa> lista = new Pessoa().popularPessoas();

        // Essa nova lista será com apenas 2 pessoas
        //Retornar uma lista com apenas 2 pessoas dentro
        Stream<Pessoa> stream = lista.stream().limit(2);

    }
}
