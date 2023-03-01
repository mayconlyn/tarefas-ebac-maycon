package br.com.maycon.entities;


public class Imovel {

    private Double valorImovel;

    public Imovel(Double valorImovel) {
        this.valorImovel = valorImovel;
    }

    public Double getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(Double valorImovel) {
        this.valorImovel = valorImovel;
    }

    public double descontoAnualSobreImovel(Double percentual) {
        return valorImovel*percentual;
    }
}
