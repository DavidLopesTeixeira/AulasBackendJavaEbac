package br.com.davidlopes;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Stream<String> stream = List.of("David", "Lopes", "Teste").stream();

        Stream<String> set = Set.of("David", "Lopes", "Teste").stream();

        Map<String, String> map = Map.of("David", "lopes");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valores = map.values().stream();

        Stream<String> streamSts = Stream.of("Valor1", "Valor2");

    }
}
