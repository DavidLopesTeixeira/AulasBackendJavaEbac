package br.com.davidlopes.interfaces;

public interface ICaneta {
    public void escrever(String texto);
    public String getCor();

    //Metodo default para todas as classes

    default void escreverComumATodas(){
        System.out.println("Escrita igual para todas");
    }
}
