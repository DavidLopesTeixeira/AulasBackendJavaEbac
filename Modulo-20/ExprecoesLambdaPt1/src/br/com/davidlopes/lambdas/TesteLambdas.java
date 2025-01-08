package br.com.davidlopes.lambdas;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class TesteLambdas {
    public static void main(String[] args) {

        // Exemplo com a interface funcional IntBinaryOperator
        IntBinaryOperator binaryOperator = (int a, int b) -> {
            return a + b;
        };

        Integer resultBinaryOperator = binaryOperator.applyAsInt(1, 2);
        System.out.println(resultBinaryOperator);

        // Exemplo com a interface funcional BiFunction
        // BiFunction<T, U, R> onde T e U são os tipos dos argumentos e R é o tipo do retorno
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) ->{
            return a * b;
        };

        Integer resultBiFun = biFunction.apply(3,2);
        System.out.println(resultBiFun);

        // Exemplo com a interface funcional BiFunction
        // Recebendo dois doubles e retornando uma String
        BiFunction<Double, Double, String> biFunStr = (a,b) -> {
            return "Resultado: " + (a + b);
        };

        String resultBiFunStr = biFunStr.apply(3.0, 2.0);
        System.out.println(resultBiFunStr);

        // OBS: Funções labdas sempre devem ser associadas a uma interface funcional

        // Exemplo de uso do método calcular
        // O método calcular recebe dois valores do tipo Long e uma função lambda que recebe dois valores do tipo Long e retorna um Long

        Long resultadoCalcular = calcular(20L, 10L ,(Long value1, Long value2) -> {
            return  value1 * value2;
        });
        System.out.println(resultadoCalcular);

        // Exemplo de uso do método calcular com a função lambda que subtrai os valores
        Long resultadoCalcularSub = calcular(20L, 10L, (value1, value2) -> value1 - value2);
        System.out.println(resultadoCalcularSub);

        // Exemplo de uso do método calcular com a função lambda que divide os valores
        Long resultadoCalcularDiv = calcular(20L, 10L, (value1, value2) -> value1 / value2);
        System.out.println(resultadoCalcularDiv);

        // Exemplo de uso do método calcular com a função lambda que soma os valores
        Long resultadoCalcularSoma = calcular(20L, 10L, (value1, value2) -> value1 + value2);
        System.out.println(resultadoCalcularSoma);


        // Exemplo de uso do método concatenar
        String nome = "David";
        String sobrenome = "Lopes";

        // O método concatenar recebe duas Strings e uma função lambda que recebe duas Strings e retorna uma String
        // podemos perceber  que a função está usando apenas uma linha de codigo
        String resultadoConcatenar = concatenar(nome, sobrenome, (a, b) -> "nome: " + a + "\nsobrenome: " + b);
        System.out.println(resultadoConcatenar);

    }
    // Método que recebe dois valores do tipo Long e uma função lambda que recebe dois valores do tipo Long e retorna um Long
    private static Long calcular(Long a, Long b, BiFunction<Long, Long, Long> function){
        return function.apply(a, b);
    }

    private static String concatenar(String a, String b ,BiFunction<String, String, String> function){
        return function.apply(a, b);
    }


}
