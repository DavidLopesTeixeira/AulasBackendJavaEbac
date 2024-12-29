package br.com.davidlopes.templatemethod;

public class Demo {
    public static void main(String[] args) {
       Trabalhador bombeiro = new Bombeiro();
       bombeiro.executar();
        System.out.println("----------");
        Trabalhador policial = new Policial();
        policial.executar();

        System.out.println("----------");
        Trabalhador juiz = new Juiz();
        juiz.executar();

        System.out.println("----------");
        Trabalhador advogado = new Advogado();
        advogado.executar();
    }
}
