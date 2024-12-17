package br.com.davidlopes.interfaces;

public interface ICarros {
    default void parar(){
        System.out.println("O carro está parando");
    }
    public void andar();
}
