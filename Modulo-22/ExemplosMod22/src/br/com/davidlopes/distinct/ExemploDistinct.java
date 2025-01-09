package br.com.davidlopes.distinct;



import br.com.davidlopes.model.Pessoa;

import java.util.List;
import java.util.stream.Stream;

public class ExemploDistinct {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();
        // Para usar o distinct devemos implementar o equals e hashcode > estamos comparando o id e nome

        Stream<Pessoa> stream = lista.stream().distinct();
        // 09:27 Aula 3: Operações intermediárias - Parte 2

    }
}
