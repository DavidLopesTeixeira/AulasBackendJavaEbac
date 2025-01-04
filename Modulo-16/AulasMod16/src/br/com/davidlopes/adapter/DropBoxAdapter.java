package br.com.davidlopes.adapter;

import java.io.File;

public class DropBoxAdapter implements PercistenciaArquivos{
    private DropBox dropBox;

    public DropBoxAdapter(DropBox dropBox) {
        this.dropBox = dropBox;
    }

    @Override
    public void gravar(File file) {
dropBox.download(file.getAbsolutePath());
    }

    @Override
    public File ler(String caminho) {
        DropBoxFile file = dropBox.download(caminho);
        return new File(file.getLocalPath());
    }
}
