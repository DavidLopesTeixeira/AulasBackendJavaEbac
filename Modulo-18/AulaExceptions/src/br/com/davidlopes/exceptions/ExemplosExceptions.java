package br.com.davidlopes.exceptions;

public class ExemplosExceptions {
    public static void main(String[] args) {
        //semTratamentoExeption();
        //comTratamentoExeption();
        //comTratamentoExeptionComFinally();
        lancarRuntimeException();
        System.out.println("Esse codigo nao deve ser exibido caso ocorra erro no  (lancarRuntimeException)");
    }

    private static void lancarRuntimeException() {
        try{
            String frase = null;
            String novaFrase = null;
            novaFrase = frase.toUpperCase();
        }catch (Exception e ){
            throw new RuntimeException("Parando o sistema");
        }
        System.out.println("Teste");
    }

    private static void comTratamentoExeptionComFinally() {
        String frase = null;
        String novaFrase = null;
        try{

            novaFrase = frase.toUpperCase();
        }catch (NullPointerException e ){
            // Tratamento da exceção
            System.out.println("Logando o erro " + e.getMessage());
            System.out.println("A nova frase não pode ser gerada, pois a frase original é nula");
            // Não podemos fazer como nesse exemplo abaixo, pois caso ocorra qq tipo de nullpointerexception, o programa deve parar
            // Nuca podemos tratar o nullpointerexception pois ele herda de runtimeexception
            frase = "Frase vazia";
        } finally {
            // O finally sempre será executado, independente se ocorreu ou não a exceção
            novaFrase = frase.toUpperCase();

        }
        System.out.println("Frase  " + novaFrase);
    }

    private static void comTratamentoExeption() {
        String frase = null;
        String novaFrase = null;
        try{

            novaFrase = frase.toUpperCase();
        }catch (NullPointerException e ){
            // Tratamento da exceção
            System.out.println("Logando o erro " + e.getMessage());
            System.out.println("A nova frase não pode ser gerada, pois a frase original é nula");
            // Não podemos fazer como nesse exemplo abaixo, pois caso ocorra qq tipo de nullpointerexception, o programa deve parar
            // Nuca podemos tratar o nullpointerexception pois ele herda de runtimeexception
            frase = "Frase vazia";
            novaFrase = frase.toUpperCase();
            System.out.println("Frase  " + novaFrase);
        }
    }

    private static void semTratamentoExeption() {
        String frase = null;
        String novaFrase = null;
        novaFrase = frase.toUpperCase();
        System.out.println("Frase antiga " + novaFrase);
        System.out.println("Frase nova: " + novaFrase);
    }
}
