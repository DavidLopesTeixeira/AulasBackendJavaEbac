package br.com.davidlopes.terminais.exforeach;

import br.com.davidlopes.model.Pessoa;

import java.util.List;

public class ExemploForEach {
    public static void main(String[] args) {
        // Operações terminais retornam os dados tratados -> computados

        // Lista de objeto pessoas
        List<Pessoa> lista = new Pessoa().popularPessoas();
        // Operação terminal
        System.out.println("Operações Finais");
        System.out.println("Imprimindo o nome de todas as pessoas no (obj) Pessoa\n");
        lista.stream().forEach(pessoa -> System.out.println("Nome: " + pessoa.getNome()));
        System.out.println("\n");

        //Operação intermediaria + operação final
        System.out.println("Operação intermediaria + operação final");
        System.out.println("Selecionando todas as pessoas que a nacionalidade seja igual a Brasil \n");
        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil")) // essa é uma operação intermediaria
                .forEach(variavelSelecionados -> System.out.println("Brasileiros: " + variavelSelecionados)); //operação terminal

        //Operação intermediaria + gerando um novo stream de inteiros com o map + operação final imprimir as idades
        System.out.println("Selecionando todas as pessoas que a nacionalidade seja igual a Brasil");
        System.out.println("Criando uma nova stream de inteiro com os valores recebidos\n");
        lista.stream()
                .filter(variP -> variP.getNacionalidade().equals("Brasil")) // filtrando toas as pessoas com a nacionalidade igual a Brasil
                .map(Pessoa::getIdade) // o map vai gerar um novo stream de inteiro com as idades
                .forEach(p -> System.out.println("Idades: " + p));
    }
}
