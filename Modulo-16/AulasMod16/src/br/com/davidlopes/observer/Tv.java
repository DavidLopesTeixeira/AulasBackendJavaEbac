package br.com.davidlopes.observer;

public class Tv implements Observer{

    @Override
    public void update(Subject subject) {
        System.out.println("Rebendo a noticia via Tv " + subject.toString());
    }
}
