package br.com.davidlopes.templatemethod;

/**
 * Classe que representa um tipo específico de trabalhador: o Juiz.
 * Esta classe estende a classe abstrata 'Trabalhador' e implementa os métodos
 * que definem o comportamento específico de um juiz, incluindo o local de trabalho,
 * o horário de levantar e os meios de transporte utilizados.
 */
public class Juiz extends Trabalhador {

    /**
     * Implementação do método abstrato 'trabalhar()' da classe 'Trabalhador'.
     * Este método descreve o trabalho específico de um Juiz, que é realizar
     * atividades no fórum, como julgamentos e audiências.
     */
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando no Fórum");
    }

    /**
     * Sobrescrita do método 'levantar()' da classe 'Trabalhador'.
     * O Juiz tem um horário específico para se levantar (às 11 da manhã),
     * diferente do horário padrão de outros trabalhadores.
     */
    @Override
    protected void levantar() {
        // Se você quiser reutilizar o comportamento padrão de 'levantar()', pode chamar 'super.levantar()'.
        super.levantar(); // Reaproveitamos o metodo da classe  Trabalhador
        // por isso imprimiu 2x o levantar da cama
        System.out.println("Levantando da cama às 11 da manhã");


    }

    /**
     * Sobrescrita do método 'irAoTrabalho()' da classe 'Trabalhador'.
     * O Juiz vai ao trabalho utilizando um carro do estado, algo específico dessa profissão.
     */
    @Override
    protected void irAoTrabalho() {
        // Se você quiser reutilizar o comportamento padrão de 'irAoTrabalho()', pode chamar 'super.irAoTrabalho()'.
        // super.irAoTrabalho();
        System.out.println("Indo trabalhar com o carro do estado");
    }

    /**
     * Sobrescrita do método 'voltarParaCasa()' da classe 'Trabalhador'.
     * O Juiz volta para casa de helicóptero, algo muito específico dessa profissão.
     */
    @Override
    protected void voltarParaCasa() {
        // Se você quiser reutilizar o comportamento padrão de 'voltarParaCasa()', pode chamar 'super.voltarParaCasa()'.
        // super.voltarParaCasa();
        System.out.println("Voltando para casa de helicóptero");
    }
}
