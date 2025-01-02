package br.com.davidlopes.facade;

public class ApartamentoService implements IApartamentoService{
    @Override
    public void alugarApartamento() {
        verificarDisponibilidade();
        verificarNomeCliente();
        verificarCpfCliente();
        verificarRendaCliente();
        AlugandoApartamento();
    }

    public boolean isApartamentoAlugado(){
        if (AlugandoApartamento()){
            return true;
        } else {
            return false;
        }
    }

    private boolean AlugandoApartamento() {
        boolean alugado = false;
        if(verificarDisponibilidade() && verificarRendaCliente()){
            System.out.println("Alugando apartamento");
            alugado = true;
        } else {
            System.out.println("Não foi possível alugar apartamento");
        }
        return alugado;
    }

    private boolean verificarRendaCliente() {
        System.out.println("Verificando renda do cliente");
        int renda = (int) (Math.random() * 5000);
        Boolean rendaSuficiente = false;


        if(renda >= 2000){
            System.out.println("Renda suficiente");
            System.out.println("Renda do cliente: " + renda);
            rendaSuficiente = true;
        } else {
            System.out.println("Renda insuficiente");
            System.out.println("Renda do cliente: " + renda);
        }
        return rendaSuficiente;
    }

    private void verificarCpfCliente() {
        System.out.println("Verificando CPF do cliente");
    }

    private void verificarNomeCliente() {
        System.out.println("Verificando nome do cliente");
    }

    private boolean verificarDisponibilidade() {
        System.out.println("Verificando disponibilidade do apartamento");

        Boolean isDisponivel = false;

        int val = (int) (Math.random() * 2);
        if (val == 0) {
            System.out.println("Apartamento disponível");
            isDisponivel = true;
        } else {
            System.out.println("Apartamento indisponível");
        }
        return  isDisponivel;
    }

}
