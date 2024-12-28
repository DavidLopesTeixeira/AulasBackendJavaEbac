package br.com.davidlopes.singleton;

public class DemoSigleton {

    public static void main(String[] args) {
        Singleton singleton  =  Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("Ex1 " + " Endereço de memoria do construtor  da classe ,   : " + singleton);
        System.out.println("Ex2" + " Endereço de memoria do construtor  da classe ,   : " + singleton1);
    }

}
