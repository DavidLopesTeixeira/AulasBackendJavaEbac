package br.com.davidlopes.observer;

public class Demo {
    public static void main(String[] args) {
        Jornalista jornalista = new Jornalista();
        jornalista.add(new Tv());
        jornalista.add(new Jornal());
        jornalista.notifyAll("Noticia de ultima hora", "Bob Esponja foi eleito presidente do Brasil");
    }
}
