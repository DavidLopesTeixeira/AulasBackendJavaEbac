package br.com.david.interfaces.domain;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private String curso;
    private double nota;
    private String sala;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Aluno(String nome, String curso, double nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    // Convertendo o objeto em texto para evitar o erro de imprimir o caminho guardado em memória
    // Tbm serve par imprimir o objeto no console
    @Override
    public String toString() {
        return this.nome;
    }

    //Comparando o nome da classe com o nome que vem do método
    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }
}
