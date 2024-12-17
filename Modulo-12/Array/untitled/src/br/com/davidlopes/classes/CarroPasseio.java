package br.com.davidlopes.classes;

import br.com.davidlopes.interfaces.ICarros;

public class CarroPasseio implements ICarros {


    @Override
    public void parar() {
        ICarros.super.parar();
    }

    @Override
    public void andar() {
        System.out.println("O carro de passeio está andando...");
    }
}
