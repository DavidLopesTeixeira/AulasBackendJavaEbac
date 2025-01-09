package br.com.davidlopes.map;

import br.com.davidlopes.model.Pessoa;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExemploMap {
    public static void main(String[] args) {
        // Cria uma lista de pessoas a partir do método popularPessoas(), que deve retornar uma lista de objetos Pessoa.
        List<Pessoa> lista = new Pessoa().popularPessoas();

        // Criando um Stream de Integer:
        // 1. Primeiro, usamos o método 'stream()' para criar um stream a partir da lista de pessoas.
        // 2. Aplicamos o 'filter()' para filtrar as pessoas cuja nacionalidade é "Brasil".
        // 3. Depois, usamos o 'map()' para transformar cada objeto Pessoa em sua idade (retorna um Stream de Integer).
        // O método map() aplica a função 'Pessoa::getIdade' para cada elemento do Stream original.
        Stream<Integer> stream = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil")) // Filtra as pessoas com nacionalidade "Brasil"
                .map(Pessoa::getIdade); // Transforma cada pessoa em sua idade (Stream de Integer)

        // Criando um IntStream (Stream de primitivos int):
        // 1. Similar ao exemplo anterior, criamos um Stream a partir da lista de pessoas.
        // 2. Filtramos as pessoas com nacionalidade "Brasil" utilizando 'filter()'.
        // 3. Usamos o 'mapToInt()' ao invés de 'map()' para criar um IntStream, que é um tipo de Stream especializado para valores primitivos 'int'.
        // O método 'mapToInt()' aplica a função 'Pessoa::getIdade' e retorna um IntStream com valores primitivos 'int'.
        IntStream stream1 = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil")) // Filtra as pessoas com nacionalidade "Brasil"
                .mapToInt(Pessoa::getIdade); // Transforma cada pessoa em sua idade (IntStream, valores primitivos int)
    }
}
