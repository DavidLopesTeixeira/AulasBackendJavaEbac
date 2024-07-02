package br.com.david.lopes;

public class AutoBoxing {

    public static void main(String[] args) {

        //O boxing e auto boxing recebe valores primitivos no wrapper
        //Boxing
        Boolean status = true;
        Boolean status1 = Boolean.TRUE;
        Character c = 'A';

        Integer idade = 32;

        Long cpf = 55555555555L;
        Long newCpf = Long.valueOf(123456789);


        // Unboxing

        boolean status2 = Boolean.TRUE;
        char letra = Character.valueOf('A');

        int idade2 = Integer.valueOf(12);
        
        long cpf3 = Long.valueOf(123456);
    };
}
