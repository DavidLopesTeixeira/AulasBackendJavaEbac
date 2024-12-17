package br.com.davidlopes.classes;

import br.com.davidlopes.interfaces.ICaneta;
import br.com.davidlopes.interfaces.ICarros;

public class ClasseTeste {
    public static void main(String[] args) {
        ICaneta caneta = new CanetaEsferografica();

        caneta.escrever("David ");
        System.out.println(caneta.getCor());

        System.out.println("");

        ICaneta giz = new Giz();
        giz.escrever("Daniela");
        System.out.println(giz.getCor());

        System.out.println("");

        ICaneta lapiz = new Lapiz();
        lapiz.escrever("Anália");
        System.out.println(lapiz.getCor());

        System.out.println("---- Carros ----");

        ICarros passeio = new CarroPasseio();
        passeio.andar();
        passeio.parar();

        System.out.println("");

        ICarros caminhao = new Caminhao();
        caminhao.andar();
        caminhao.parar();
    }
}
