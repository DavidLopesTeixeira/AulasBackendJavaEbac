package br.com.davidlopes.templatemethod;

/**
 * Classe que representa um tipo específico de trabalhador: o Policial.
 * Esta classe estende a classe abstrata 'Trabalhador' e implementa o método
 * abstrato 'trabalhar()', fornecendo o comportamento específico para um policial.
 * Além disso, sobrescreve o método 'levantar()' para ajustar o comportamento
 * de levantar ao contexto específico do policial.
 */
public class Policial extends Trabalhador {

    /**
     * Implementação do método abstrato 'trabalhar()' da classe 'Trabalhador'.
     * Este método define o que um policial faz durante o expediente, ou seja,
     * o policial realizará ações específicas relacionadas ao seu trabalho,
     * como patrulhar, fazer investigações, entre outros.
     */
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como Policial");
    }

    /**
     * Sobrescrita do método 'levantar()' da classe 'Trabalhador'.
     * A rotina do policial é diferente, então este método exibe um comportamento
     * específico, indicando que o policial levanta às 8 da manhã, algo que pode
     * ser comum para esse tipo de trabalhador.
     */
    @Override
    protected void levantar() {
        System.out.println("Levantando da cama às 8 da manhã");
    }
}
