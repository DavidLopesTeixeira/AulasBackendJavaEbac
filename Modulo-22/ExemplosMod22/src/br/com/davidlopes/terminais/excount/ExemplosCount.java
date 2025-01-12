package br.com.davidlopes.terminais.excount;

import br.com.davidlopes.model.Pessoa;

import java.util.List;

public class ExemplosCount {
    public static void main(String[] args) {
        // O método count retorna a quantidade de elementos presentes em uma stream
        // Ele é classificado como uma operação de redução (reduction).
        // Como exemplo o trecho de código a seguir mostra como obter o número de pessoas
        //em uma lista cujo nome começa com a letra "M"

        List<Pessoa> lista = new Pessoa().popularPessoas();

        // Variavel count para armazenar o resultado do filtro
        System.out.println("Quantidade de pessoas em que o nome começa com a letra (M)");
        long count = lista.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("M")) // operação intermediaria
                .count();  // Operação final
        System.out.println("Quantidade: " + count);

    }
}
