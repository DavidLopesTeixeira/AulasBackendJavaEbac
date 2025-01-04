package br.com.davidlopes.adapter;

import java.io.File;

public interface PercistenciaArquivos {
    public void gravar(File file);
    public File ler(String caminho);
}
