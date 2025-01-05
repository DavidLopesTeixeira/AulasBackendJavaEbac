package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExemploWildCard {
    public static void main(String[] args) {

        List<String> listaSt = new ArrayList<>();
        listaSt.add("David");
        listaSt.add("Daniela");
        listaSt.add("Analia");

        List<Integer> listaInt = new ArrayList<>();
        listaInt.add(10);
        listaInt.add(20);
        listaInt.add(30);

        List<Double> listaDouble = new ArrayList<>();
        listaDouble.add(130.50);
        listaDouble.add(220.04);
        listaDouble.add(30.5);
        imprimir(listaSt);
        imprimir(listaInt);
        imprimeEConverte(listaSt);
        imprimeEConverte(listaInt);
        imprimeEConverte(listaDouble);


    }
    // Metodo wildcard que recebe uma lista de qualquer tipo
    private static void imprimir(List<?> lista){
        for(Object obj : lista){
            System.out.println(obj + " Imprime qq coisa");
        }
    }

    // Metodo wildcard que recebe uma lista de qualquer tipo e converte para algum tipo
    private static void imprimeEConverte(List<?> lista){
        for(Object obj : lista){
            if(obj instanceof String){
                obj = (String) obj;
                System.out.println(obj + " String");
            } else if (obj instanceof Integer) {
                obj =(Integer) obj;
                System.out.println(obj + " Integer");
            } else if (obj instanceof Long) {
                obj = (Long) obj;
                System.out.println(obj + " Long");
            } else if (obj instanceof Double) {
                obj = (Double) obj;
                System.out.println(obj + " Double");
            }
        }
    }
}
