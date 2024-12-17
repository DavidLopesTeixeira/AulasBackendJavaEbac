package br.com.davidlopes.classes;

import br.com.davidlopes.interfaces.ICarros;

public class Caminhao implements ICarros {
    @Override
    public void parar() {
        System.out.println("Está parando como um caminhão...");
    }

    @Override
    public void andar() {
        System.out.println("Está andando como um caminhão");
    }
}
