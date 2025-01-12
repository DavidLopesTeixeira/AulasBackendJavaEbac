package br.com.davidlopes.model;

import java.util.List;

public class Pessoa {
    private String id;
    private String nome;
    private String nacionalidade;
    private int idade;

    public Pessoa(String id, String nome, String nacionalidade, int idade){
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public Pessoa(){

    }

    public Pessoa(Pessoa pessoa) {
        this(pessoa.getId(), pessoa.getNome(), pessoa.getNacionalidade(), pessoa.getIdade());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Pessoa> popularPessoas(){
        // Instanciando varias pessoas
        Pessoa pessoa1 = new Pessoa("P1","David Lopes", "Brasil", 32);
        Pessoa pessoa2 = new Pessoa("P2","Daniela Lopes", "Brasil", 29);
        Pessoa pessoa3 = new Pessoa("P3", "Hernandez Roja", "Mexico", 21);
        Pessoa pessoa4 = new Pessoa("P4", "Mario Fernandes", "Canada", 21);

        // Retornando uma lista com 4 pessoas
        return List.of(pessoa1, pessoa2, pessoa3, pessoa4);
    }

    @Override
    public String toString() {
        return "Pessoa " +
        "id: " + id
        + "\nNome: " + nome
        +"\nNacionalidade: " + nacionalidade
        +"\nIdade: " + idade
                + "\n";
    }


}
