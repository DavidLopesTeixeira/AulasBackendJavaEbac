package br.com.davidlopes.singleton;

public class DemoSingletonPropriedade {
    public static void main(String[] args) {
        SingletonPropriedade singleton =  SingletonPropriedade.getInstance("Valor1");
        SingletonPropriedade singeton2 = SingletonPropriedade.getInstance("Valor 2");

        System.out.println("Valor do primeiro teste  " + singleton.getValue());
        System.out.println("Valor do segundo teste "  + singeton2.getValue());
        verificarValores(singleton, singeton2);
        System.out.println("Assim podemos Confirmar que  a unica instancia e valor validos foram a primeira a ser criada");


    }

    private static void verificarValores(SingletonPropriedade singleton, SingletonPropriedade singeton2) {
        String msg;
        if(singleton.getValue().equals(singeton2.getValue())){
            msg = "Valores são identicos";
        } else {
            msg  = "Valores  são diferentes";
        }
        System.out.println(msg);
    }

}
