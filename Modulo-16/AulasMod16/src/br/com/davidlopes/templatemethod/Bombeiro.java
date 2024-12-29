package br.com.davidlopes.templatemethod;

/**
 * Classe que representa um tipo específico de trabalhador: o Bombeiro.
 * Esta classe estende a classe abstrata 'Trabalhador' e implementa o método
 * abstrato 'trabalhar()', fornecendo o comportamento específico para um bombeiro.
 */
public class Bombeiro extends Trabalhador {

    /**
     * Implementação do método abstrato 'trabalhar()' da classe 'Trabalhador'.
     * Este método define o que um bombeiro faz durante o expediente,
     * ou seja, o bombeiro realizará ações específicas relacionadas ao seu trabalho.
     */
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como bombeiro");
    }
}
