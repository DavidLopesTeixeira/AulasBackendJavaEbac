package br.com.davidlopes.exceptions.minhas;

public class AppExemploThrow {
    public static void main(String[] args) {

        exception();
        //runtimeException();
    }

    private static void runtimeException() {
        ExemploThrow.saqueRuntimeException(500.00d);
    }

    private static void exception() {
        try {
            ExemploThrow.saque(500.00d);
        } catch (LimiteSaqueExeption e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
