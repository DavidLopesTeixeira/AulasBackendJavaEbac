package br.com.davidlopes.exceptions.minhas;

public class ExemploThrow {

    public static void saque(double valor) throws LimiteSaqueExeption {
        if(valor > 400){
            LimiteSaqueExeption erro = new LimiteSaqueExeption("Limite de saque diário é de R$ 400,00");
            throw erro;
        } else {
            System.out.println("Saque realizado com sucesso");
        }
    }

    public static void saqueRuntimeException(double valor){
        if(valor > 400){
            IllegalArgumentException erro = new IllegalArgumentException("Limite de saque diário é de R$ 400,00");
            throw erro;
        } else {
            System.out.println("Saque realizado com sucesso");
        }
    }
}
