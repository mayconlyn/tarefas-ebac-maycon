package br.com.maycon.entities;

public abstract class Pessoa {

    private String nome;
    private Imovel imovel;
    private Double percentualDeDesconto;

    public Pessoa(){};

    public Pessoa(String nome, Imovel imovel, Double percentualDeDesconto){
        this.nome = nome;
        this.imovel = imovel;
        this.percentualDeDesconto = percentualDeDesconto;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Double getPercentualDeDesconto() {
        return percentualDeDesconto;
    }

    public void setPercentualDeDesconto(Double percentualDeDesconto) {
        this.percentualDeDesconto = percentualDeDesconto;
    }

    public abstract void imprimirDados();
}
