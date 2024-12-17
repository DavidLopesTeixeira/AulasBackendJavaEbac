package br.com.davidlopes.abstratas;

public class Horista extends Empregado{
    private Double precoHora;
    private Double totalHorasTrabalhadas;

    @Override
    public Double vencimentol() {
        return precoHora * totalHorasTrabalhadas;
    }

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getTotalHorasTrabalhadas() {
        return totalHorasTrabalhadas;
    }

    public void setTotalHorasTrabalhadas(Double totalHorasTrabalhadas) {
        this.totalHorasTrabalhadas = totalHorasTrabalhadas;
    }
}
