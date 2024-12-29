package br.com.davidlopes.templatemethod;

public class Advogado  extends  Trabalhador{
    @Override
    public void executar() {
        //super.executar();
        // caso deixássemos  o super executar
        // iria inicializar todas as tarefas e depois imprimir o estou de ferias
        System.out.println("Estou de Ferias");
    }

    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como advogado");
    }
}
