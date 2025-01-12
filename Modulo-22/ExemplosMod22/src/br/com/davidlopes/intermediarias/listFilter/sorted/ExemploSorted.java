package br.com.davidlopes.intermediarias.listFilter.sorted;

import br.com.davidlopes.model.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExemploSorted {
    public static void main(String[] args) {
        // Cria uma lista de objetos Pessoa, que é preenchida pelo método popularPessoas()
        List<Pessoa> pessoas = new Pessoa().popularPessoas();

        // Criação do primeiro Stream: filtra pessoas com nacionalidade "Brasil"
        // e ordena os resultados pelo nome da pessoa de forma crescente (ordem alfabética).
        Stream stream = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil")) // Filtra as pessoas que são do Brasil
                .sorted(Comparator.comparing(Pessoa::getNome)); // Ordena pela propriedade 'nome' da pessoa

        // Criação do segundo Stream: filtra pessoas com nacionalidade "Brasil"
        // e ordena os resultados pela idade de forma crescente.
        Stream stream1 = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil")) // Filtra as pessoas que são do Brasil
                .sorted(Comparator.comparing(Pessoa::getIdade)); // Ordena pela propriedade 'idade' da pessoa em ordem crescente
        // Para cada pessoa do fluxo, imprime o resultado com a mensagem "ordenando do menor para o maior"
        stream1.forEach(i -> System.out.println("ordenando do menor para o maior \n" + i));

        // Criação do terceiro Stream: filtra pessoas com nacionalidade "Brasil"
        // e ordena os resultados pela idade de forma decrescente (do maior para o menor).
        Stream stream2 = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil")) // Filtra as pessoas que são do Brasil
                .sorted((p1, p2) -> Integer.compare(p2.getIdade(), p1.getIdade())); // Ordena pela idade de forma decrescente
        // Para cada pessoa do fluxo, imprime o resultado com a mensagem "ordenando do maior para menor"
        stream2.forEach(i -> System.out.println("ordenando do maior para menor \n" + i));
    }
}
