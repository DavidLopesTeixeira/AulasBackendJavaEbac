package br.com.davidlopes.abstratas;

public class Assalariado extends Empregado{
    private Double salario;

    @Override
    public Double vencimentol() {
        return salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
