package br.com.davidlopes;

import br.com.davidlopes.facade.ApartamentoService;

public class Demo {
    public static void main(String[] args) {
        ApartamentoService apatamento1 = new ApartamentoService();
        apatamento1.alugarApartamento();

        int tentativa = 0;
        while(!apatamento1.isApartamentoAlugado()){
            tentativa = tentativa + 1;
            System.out.println("Tentando alugar apartamento tentiva numero: " + tentativa);
            System.out.println("===================================");
            apatamento1.alugarApartamento();
        }
    }
}
