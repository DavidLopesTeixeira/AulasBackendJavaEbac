package br.com.davidlopes.templatemethod;

/**
 * Classe abstrata que define a estrutura de uma rotina de trabalho.
 * Esta classe segue o padrão Template Method, permitindo que subclasses
 * implementem o comportamento de trabalho específico, mas mantendo a estrutura
 * geral da rotina comum entre diferentes tipos de trabalhadores.
 *
 * O método 'executar()' define a sequência de passos que todos os trabalhadores
 * seguem, com a variação ocorrendo no método 'trabalhar()', que deve ser implementado
 * pelas subclasses para definir o que cada trabalhador faz durante o expediente.
 */
public abstract class Trabalhador {

    /**
     * Método abstrato que define o trabalho a ser realizado.
     * Este método deve ser implementado pelas subclasses para descrever
     * o que cada tipo de trabalhador faz durante o expediente.
     *
     * Exemplos:
     * - Um Bombeiro pode "apagar incêndios".
     * - Um Desenvolvedor pode "escrever código".
     */
    protected abstract void trabalhar();

    /**
     * Método principal que executa a sequência de passos comuns da rotina de trabalho.
     * Este método invoca a sequência de ações de um trabalhador, incluindo os métodos
     * de rotina, como levantar, ir ao trabalho, e voltar para casa.
     *
     * As subclasses precisam apenas implementar o método 'trabalhar()', pois os outros
     * métodos são comuns a todos os trabalhadores e são chamados na ordem correta.
     */
    public void executar(){
        iniciarRotina();    // Começa a rotina do trabalhador
        levantar();         // O trabalhador se levanta
        irAoTrabalho();     // O trabalhador vai para o trabalho
        trabalhar();        // Aqui ocorre o trabalho específico de cada tipo de trabalhador
        voltarParaCasa();   // O trabalhador retorna para casa após o expediente
    }

    /**
     * Método privado que simula a ação de voltar para casa após o trabalho.
     * Este método é comum para todos os trabalhadores e não pode ser sobrescrito.
     * Ele será sempre executado ao final da rotina.
     */
    protected void voltarParaCasa() {
        System.out.println("Voltando para casa");
    }

    /**
     * Método privado que simula a ação de ir ao trabalho no início do dia.
     * Este método é comum a todos os trabalhadores e será sempre chamado
     * como parte da rotina, mas não pode ser sobrescrito nas subclasses.
     */
    protected void irAoTrabalho() {
        System.out.println("Indo trabalhar");
    }

    /**
     * Método privado que simula o início da rotina de trabalho.
     * Ele é chamado no início da execução do dia de trabalho e é comum
     * a todos os trabalhadores, não sendo necessário sobrescrevê-lo nas subclasses.
     */
    protected void iniciarRotina() {
        System.out.println("Iniciando Rotina");
    }

    /**
     * Método protegido que simula o ato de levantar da cama.
     * Este método pode ser sobrescrito nas subclasses se houver necessidade
     * de personalizar a ação de levantar para diferentes tipos de trabalhadores.
     */
    protected void levantar() {
        System.out.println("Levantando da cama");
    }
}
