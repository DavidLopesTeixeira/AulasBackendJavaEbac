package br.com.davidlopes.observer;

public interface Subject {
    //Documente os metodos abaixo
    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifyAll(String titulo, String noticia);
}
