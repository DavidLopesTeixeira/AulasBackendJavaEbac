package br.com.davidlopes.adapter;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        String file = "Teste.txt";
        DropBox dropBox = new DropBox();
        PercistenciaArquivos arquivos = new DropBoxAdapter(dropBox);
        arquivos.gravar(new File(file));
    }
}
