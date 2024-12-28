package br.com.davidlopes.singleton;

public class SingletonPropriedade {
    // Atributos da classe
    private  static SingletonPropriedade singleton;
    private String value;

    private SingletonPropriedade(String value){
        this.value = value;
    }


    // Metodo que checa se já existe uma instância criada.
    // Caso exista mais que uma instância a unica que será considerada valida será a primeira com o seu valor
    // todas as outras instâncias e valores assumiram o valor da primeira
    public static SingletonPropriedade getInstance(String value){
        if(singleton == null){
            singleton = new SingletonPropriedade(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}
