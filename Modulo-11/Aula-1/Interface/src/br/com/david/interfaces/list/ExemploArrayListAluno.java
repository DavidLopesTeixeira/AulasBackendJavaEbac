package br.com.david.interfaces.list;

import br.com.david.interfaces.domain.Aluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayListAluno {

    public static void main(String[] args) {
        exemploListaSimplesOrdenadaClasseExterna();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna() {
        System.out.println("***** Exemplo lista simples ordenada classe externa");
        //Adicionando o objeto aluno na interface
        List<Aluno> lista = new ArrayList<>();
        //Instanciando o objeto Aluno
        Aluno a = new Aluno("João da silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        //Adicionando as instancias do objeto aluno na lista
        lista.add(a);
        lista.add(b);
        lista.add(c);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");

    }
}
