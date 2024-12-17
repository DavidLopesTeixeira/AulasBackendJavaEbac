package br.com.davidlopes.classes;

import br.com.davidlopes.interfaces.ICaneta;

public class CanetaEsferografica implements ICaneta {
    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o valor " + texto + " Na classe " + getClass().getSimpleName());

    }

    @Override
    public String getCor() {
        return "Preta";
    }
}
