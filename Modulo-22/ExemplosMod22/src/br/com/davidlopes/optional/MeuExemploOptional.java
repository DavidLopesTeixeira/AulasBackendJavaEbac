package br.com.davidlopes.optional;

import br.com.davidlopes.model.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MeuExemploOptional {
    public static void main(String[] args) {
        // Criando uma lista de pessoas a partir do método popularPessoas() da classe Pessoa.
        // Esse método retorna uma lista de objetos Pessoa (não mostrado no código).
        List<Pessoa> pessoas = new Pessoa().popularPessoas();

        // Buscando a pessoa com a maior idade utilizando o stream.
        // O método max retorna um Optional que contém a pessoa com a maior idade (caso exista).
        // O Optional é utilizado para evitar retornar null, o que poderia gerar NullPointerException.
        Optional<Pessoa> idadeMaxima = pessoas.stream()
                .max(Comparator.comparing(Pessoa::getIdade)); // Comparando a idade das pessoas.

        // Verificando se a pessoa com a maior idade foi encontrada.
        // O método isPresent() verifica se o valor está presente no Optional (se a pessoa foi encontrada).
        if (idadeMaxima.isPresent()) {
            // Se presente, imprime a pessoa com a maior idade.
            // Usamos get() para acessar o valor dentro do Optional de forma segura.
            System.out.println("Essa pessoa tem a maior idade da lista: " + idadeMaxima.get());
        }

        // Buscando a pessoa com a menor idade utilizando o stream.
        // O método min retorna um Optional que contém a pessoa com a menor idade (caso exista).
        Optional<Pessoa> idadeMinima = pessoas.stream()
                .min(Comparator.comparing(Pessoa::getIdade)); // Comparando a idade das pessoas.

        // Verificando se a pessoa com a menor idade foi encontrada.
        if (idadeMinima.isPresent()) {
            // Se presente, imprime a pessoa com a menor idade.
            // Da mesma forma, usamos get() para acessar o valor presente no Optional.
            System.out.println("Essa pessoa tem a menor idade da lista: " + idadeMinima.get());
        }

        // Caso a pessoa com a menor idade não tenha sido encontrada (Optional vazio),
        // o código executa a lógica dentro do método ifPresentOrElse.
        // O método ifPresentOrElse executa uma ação caso o Optional esteja presente ou, caso contrário, executa outra ação.
        idadeMinima.ifPresentOrElse(
                // Caso idadeMinima esteja presente (ou seja, a pessoa com a menor idade foi encontrada),
                // imprime essa pessoa. O System.out::println é um método de referência que imprime o valor.
                System.out::println,

                // Caso idadeMinima não esteja presente (não encontrou pessoa com a menor idade),
                // o Runnable será executado. Dentro dele, verificamos se idadeMaxima está presente.
                // Se idadeMaxima estiver presente, a pessoa com a maior idade será impressa.
                new Runnable() {
                    @Override
                    public void run() {
                        if (idadeMaxima.isPresent()) {
                            // Verifica se o Optional idadeMaxima contém algum valor (se a pessoa com a maior idade foi encontrada).
                            System.out.println("Encontrei essa pessoa: " + idadeMaxima.get());
                        }
                    }
                }
        );
    }
}
