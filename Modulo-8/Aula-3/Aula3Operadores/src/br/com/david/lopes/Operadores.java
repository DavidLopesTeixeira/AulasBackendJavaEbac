package br.com.david.lopes;

public class Operadores {

    public static void main(String[] args) {
        operacoesAritmeticas();
        operacoesAtribuicoes();
        operacoesIncrementoDecremento();
        operecoesRelacionais();
    }

    private static void operecoesRelacionais() {
        System.out.println("Operações relacionais");

        int num1 = 10;
        int num2 = 10;
        boolean isMaior = num1 > num2;
        System.out.println("isMaior = " + isMaior);

        boolean isMenor = num1 < num2;
        System.out.println("isMenor = " + isMenor);

        boolean isIgual = num1 == num2;
        System.out.println("isIgual = " + isIgual);

        boolean isDiferente = num1 != num2;
        System.out.println("isDiferente = " + isDiferente);

        boolean isExemplo = num1+1 == num2;
        System.out.println("isExemplo = " + isExemplo);

        boolean isMaiorOuIgual = num1 >= num2;
        System.out.println("isMaiorOuIgual = " + isMaiorOuIgual);

        // Dentro 1...10
        System.out.println("Operador && caso retorne um falso a condição será falsa");
        boolean isDentro =  num1 >=1 && num1 <=10;
        System.out.println("Dentro 1...10 = " +  isDentro);

        System.out.println("Operador || 'ou' caso retorne uma condição verdadeira o resultado será verdadeiro ");
        boolean isOu = num1 >=1 || num1 <=-1;
        System.out.println("isOu = " + isOu);

        System.out.println("Operador de negação '!'");
        boolean isNot = num1 >=1;
        System.out.println("isNot = " + !isNot);
    }

    public static void operacoesIncrementoDecremento() {
        System.out.println("Operações incremento e decremento");
        int num1 = 10;
        System.out.println(num1);
        num1++;
        System.out.println(num1);
        num1--;
        System.out.println(num1);
    }

    private static void operacoesAtribuicoes() {
        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;
        numero3 += numero3;

        System.out.println(numero3);
    }
    // Metodo Operaçoes aritmeticas

    public static void operacoesAritmeticas() {
        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 / num2;
        int num6 = num1 * num2;
        int num7 = (10 + 10)/2;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
    }

}
