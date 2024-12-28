package br.com.davidlopes.singleton;

public class Singleton {
    // Atributo  privado da classe
    private  static Singleton singleton;


    //Construtor privado, ninguem pode instanciar esse construtor a nao ser  a propria classe
    private Singleton(){
    }

    //  Metodo checha se existe já existe alguma instancia , caso não exista ele deixa criar uma nova
    //  Esse metodo assegura que só exista uma instancia do construtor da classe.
    // Caso seja instanciado mais que uma vez  esse metodo irá garantir que seja usado o mesmo endereço de memória
    // tornando assim todas as instancias a mesma instancia
    // Indenpendente de quantas instancias e quantos  valores forem criados e atribuidos  só será valido a primeira instancia e o primeiro valor atribuído
    public  static  Singleton  getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return  singleton;
    }

}
