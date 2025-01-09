package br.com.davidlopes.exemploAula;

import br.com.davidlopes.meusexemplos.model.Pessoa;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExemplosFilter {
    public static void main(String[] args) {
        // Opção 1 mais indicada

        // Criamos uma lista com todas as pessoas retornadas pelo método popularPessoas.
        // A classe Pessoa deve implementar esse método, que cria e retorna uma lista de objetos do tipo Pessoa.
        // O método popularPessoas retorna uma coleção de pessoas, provavelmente pré-definidas ou simuladas em algum lugar do código.
        List<Pessoa> pessoas = new Pessoa().popularPessoas();

        // Criamos um Stream a partir da lista de pessoas e aplicamos o filtro diretamente com uma expressão lambda.
        // O filter recebe uma condição (Predicate) e retorna um novo Stream com os elementos que atendem a essa condição.
        // Aqui, o filtro verifica se a nacionalidade da pessoa é "Brasil".
        Stream stream = pessoas.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));


        // Opção 2 -----------------------------------------------------------------------------------------------------

        // O Predicate é uma interface funcional que representa uma condição ou teste booleano sobre um objeto.
        // Ele recebe um objeto de tipo genérico (no nosso caso, 'Pessoa') e retorna um valor booleano,
        // indicando se a condição foi atendida ou não.
        // O Predicate é utilizado em operações como filter(), que filtra os elementos de um Stream com base nessa condição.
        // Abaixo, criamos um Predicate usando uma expressão lambda que verifica se a nacionalidade da pessoa é "Brasil".
        Predicate<Pessoa> predi = pessoa -> pessoa.getNacionalidade().equals("Brasil");

        // Criamos um Stream a partir da lista de pessoas e aplicamos o filtro utilizando o Predicate.
        // O Stream resultante conterá apenas as pessoas cuja nacionalidade é "Brasil".
        // Um Stream em Java é uma sequência de elementos que pode ser processada de forma funcional (sem modificar a coleção original).
        // Ele permite realizar operações como filter(), map(), reduce(), entre outras, de forma declarativa e eficiente.
        // Essas operações não alteram a coleção original, mas criam um novo Stream com os elementos modificados ou filtrados.
        Stream stream1 = pessoas.stream().filter(predi);

        // Outra forma de definir o Predicate, desta vez usando uma classe anônima.
        // O Predicate aqui também verifica se a nacionalidade da pessoa é "Brasil".
        // A principal diferença é que a definição é mais extensa, sem a sintaxe concisa das expressões lambda.
        Predicate<Pessoa> predi1 = new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa pessoa) {
                return pessoa.getNacionalidade().equals("Brasil");
            }
        };

        // Criamos um segundo Stream, aplicando o filtro da mesma forma que o anterior, mas utilizando a classe anônima.
        // Esse Stream também conterá apenas as pessoas com nacionalidade "Brasil".
        Stream stream2 = pessoas.stream().filter(predi1);
    }
}
