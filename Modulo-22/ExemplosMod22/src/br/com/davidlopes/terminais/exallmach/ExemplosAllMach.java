package br.com.davidlopes.terminais.exallmach;

import br.com.davidlopes.model.Pessoa;

import java.util.List;

public class ExemplosAllMach {
    public static void main(String[] args) {
        //Consiste em verificar se os elementos de uma coleção correspondem a um
        // determinado predicado, isto é uma caracteristica ou propriedade do objeto
        // O metodo allMatch verifica se todos os elementos de uma stream
        //atendem a um criterio passado como parãmetro, através de um Predicate, e retorna um valor booleano

        //No exemplo a seguir, cada elemento da stream é submetido a uma condição
        //que nesse caso é verificar se a pessoa nasceu no México.
        // Se todos os elementos obedecerem a essa condição será retornado true
        // caso algum dos elementos não satisfaca ao predicado será retornado false.

        //Lista de objeto pessoa
        List<Pessoa> lista = new Pessoa().popularPessoas();

        //Verificando se todos que constam na lista são mexicanos
        boolean resultado = lista.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("Mexico")); //predicado
        System.out.println("Todos da lista são Mexicanos? = " + resultado + "\n");


        // Metodo Convencional
        boolean resu = true;
        // desconstruindo cada pessoa da lista e colocando cada uma na variavel p
        System.out.println("Metodo com for \n");
        for(Pessoa p : lista){
            //se a nacionalidade for diferente de mexico
            if(!p.getNacionalidade().equals("Mexico")){
                resu = false; // o resultado vai ser false
                break;
            }
        }
    }
}
