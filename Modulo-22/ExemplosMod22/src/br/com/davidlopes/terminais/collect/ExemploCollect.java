package br.com.davidlopes.terminais.collect;

import br.com.davidlopes.model.Pessoa;

import java.util.*;
import java.util.stream.Collectors;

public class ExemploCollect {
    public static void main(String[] args) {
        // O metodo collect possibilita coletar os elementos de uma stream na forma de coleções
        // convertendo uma stream para os tipos List, Set ou Map
        
        //Lista de objeto pessoas
        List<Pessoa> lista = new Pessoa().popularPessoas();

        // filtrando pessoas com a nacionalidade igual a br
        // colocando o resultado em uma nova lista  = listaBr
        System.out.println("Armazenando o resultado em uma nova lista");
        List<Pessoa> listaBr = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil")) // intermediaria
                .collect(Collectors.toList()); // terminal
        System.out.println("Lista de brasileiros: " + listaBr);

        // Exemplo já consumindo o resultado sem armazenar em variaveis
        System.out.println("Exemplo já consumindo o resultado sem armazenar em variaveis \n");
        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        //System.out::println, que é uma forma de usar uma referência a método.
        // Em vez de escrever uma expressão lambda como pessoa -> System.out.println(pessoa),
        // usamos a referência a método System.out::println para passar diretamente o método println da
        //  classe System.out como ação para cada elemento da lista.

        //System.out::println é uma referência a método que equivale a uma expressão lambda.
        // Basicamente, isso diz: "para cada elemento da lista, chame System.out.println() passando o elemento
        // como argumento".
        System.out.println("************");
        System.out.println("************");

        // Exemplo com Set
        System.out.println("Exemplo com Set");
        Set<Pessoa> set = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Mexico"))
                .collect(Collectors.toSet());
        System.out.println("Mexicanos.Set: " +set );

        System.out.println("************");
        System.out.println("************");

        System.out.println("Exemplo com ArrayList");
        ArrayList<Pessoa> arrayList = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Canada"))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Canadenses ArrayList: " + arrayList);

        System.out.println("************");
        System.out.println("************");

        /*
        System.out.println("Exemplo TreeSet");
        TreeSet<Pessoa>treeSet = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("Brasileiros TreeSet: " + treeSet);

         */

        System.out.println("************");
        System.out.println("************");

        System.out.println("Exemplo Map");

        Map<Integer, Pessoa> map = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toMap(Pessoa::getIdade, Pessoa::new));
        map.forEach((chave,valor) -> System.out.println("idade = chave " + chave + " valor: " + valor));

        System.out.println("************");
        System.out.println("************");
        System.out.println("Agrupando por idade");
        // Agrupando pessoas pela idade
        // retorna um biConsumer


        Map<Integer, List<Pessoa>> agruparPorIdade = lista.stream()
                .collect(Collectors.groupingBy(Pessoa::getIdade));
        agruparPorIdade.forEach((chave, valor) -> System.out.println( chave + "/" + valor + "\n"
        ));

        //Agrupando por nacionalidade e somando as idades
        System.out.println("Grupo por nacionalidade e somando as idades de cada localidade ");
        Map<String, Integer>grupoPorNacionalidadeSomadosIdades = lista.stream()
                .collect(Collectors.groupingBy(Pessoa::getNacionalidade,
                        Collectors.summingInt(Pessoa::getIdade)));

        grupoPorNacionalidadeSomadosIdades.forEach((v1,v2) -> System.out.println(v1 +  "/" + " idades somadas = " + v2));
    }
}
