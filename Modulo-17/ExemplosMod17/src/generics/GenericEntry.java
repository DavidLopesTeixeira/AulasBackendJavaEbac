package generics;

// Classe generica
public class GenericEntry<T, E> {

    // Atributo do tipo generico
    private T data;
    private E codigo;

    // Construtor que recebe um dado generico
    public GenericEntry(T data, E codigo){
        this.data = data;
        this.codigo = codigo;
    }

    // Metodo que retorna o dado generico
    public T getData() {
        return this.data;
    }

    public E getCodigo(){
        return this.codigo;
    }
}
