package br.com.davidlopes.intermediarias.listFilter.distinct;



import br.com.davidlopes.model.Pessoa;

import java.util.List;
import java.util.stream.Stream;

public class ExemploDistinct {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();
        // Para usar o distinct devemos implementar o equals e hashcode > estamos comparando o id e nome
        // Distinct -> não vai repetir as pessoas com o mesmo nome e o mesmo id

        Stream<Pessoa> stream = lista.stream().distinct();


    }
}
