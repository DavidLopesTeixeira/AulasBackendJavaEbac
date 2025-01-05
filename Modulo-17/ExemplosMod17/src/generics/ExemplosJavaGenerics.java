package generics;

import java.util.ArrayList;
import java.util.List;

public class ExemplosJavaGenerics {
    public static void main(String[] args){

        List<String> lista = new ArrayList<>();
        lista.add("David");
        lista.add("21");

        List<Long> listaLong = new ArrayList<>();
        listaLong.add(10L);
        listaLong.add(20L);
        imprimir(lista);
        imprimir(listaLong);


        String primeiroSt = imprimirPrimeiroElemento(lista);
        Long primeiroLong = imprimirPrimeiroElemento(listaLong);
        System.out.println("Primeiro elemento String: " + primeiroSt);
        System.out.println("Primeiro elemento Long: " + primeiroLong);


    }
    //Metodo que recebe uma lista de qualquer tipo > Generics
    //tipo Generico <T> poderia ser<A> ou <E> ou qq coisa
    public static <T> void imprimir(List<T> lista){
        // Metodo que imprime a lista generica de qq tipo
        for(T gn : lista){
            System.out.println("imprimir generico " + gn);
        }
    }

    //Metodo que recebe uma lista de qualquer tipo > Generics e retorna o primeiro elemento sendo ele de qq tipo
    // <A> tipo generico A retorno generico
    public static <A> A imprimirPrimeiroElemento(List<A> lista){
        return lista.get(0);
    }
}
