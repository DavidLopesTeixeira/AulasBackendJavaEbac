package br.com.davidlopes.observer;

import java.util.ArrayList;
import java.util.List;

public class Jornalista implements Subject{
    public List<Observer> observers = new ArrayList<>();
    private String titulo;
    private String texto;

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAll(String titulo, String noticia) {
        this.titulo = titulo;
        this.texto = noticia;

        for(Observer ob : this.observers){
            ob.update(this);
        }
    }

    @Override
    public String toString() {
        return "Jornalista{" +
                "titulo='" + titulo + '\'' +
                ", noticia='" + texto + '\'' +
                '}';
    }
}
