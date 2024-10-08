package br.com.david.interfaces.list;

import br.com.david.interfaces.domain.Aluno;
import br.com.david.interfaces.domain.ComparaNotaAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploListaComNumeros();
    }



    private static void exemploListaComNumeros() {
        System.out.println("***** Exemplo lista Simples com numeros *****");
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(6);
        numeros.add(4);
        numeros.add(1);
        numeros.add(3);
        numeros.add(5);
        Collections.sort(numeros);
        System.out.println("Numeros em ordem crescente");
        System.out.println(numeros);
        System.out.println("");
    }

    private static void exemploListaSimples() {
        List<String> lista = new ArrayList<String>();
        System.out.println("***** Exemplo lista Simples *****");
        System.out.println("Muito utilizada para guardar varios dados ");
        System.out.println("De rapido acesso porem lenta ao apagar, adicionar dados");
        lista.add("Artur lima");
        lista.add("Caio sampaio");
        lista.add("Eduardo plesto");
        lista.add("Daniel lopes");
        lista.add("Zorete fonseca");

        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        List<String> lista = new ArrayList<String>();
        System.out.println("***** Exemplo lista Simples em ordem ascendente *****");
        System.out.println("Classe Collections metodo sort  ");
        System.out.println("Para organizar o array na ordem ascendente -> (cima pra baixo)");
        System.out.println("Vai imprimir a lista em ordem alfabetica");
        lista.add("Artur lima");
        lista.add("Caio sampaio");
        lista.add("Eduardo plesto");
        lista.add("Daniel lopes");
        lista.add("Zorete fonseca");
        // ordenando em ordem ascendente
        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista);

        System.out.println(lista);
        System.out.println("");
    }
}
