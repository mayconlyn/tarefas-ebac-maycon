package br.com.maycon.entities;

import br.com.maycon.enums.Percentual;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String nome, String cnpj, Imovel imovel) {
        super(nome, imovel, Percentual.PJURIDICA.getValor());
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Nome da empresa: "+getNome()+"\nCNPJ: "+cnpj);
        System.out.println("Desconto Anual do imposto do Imovel: R$"+
                getImovel().descontoAnualSobreImovel(getPercentualDeDesconto())+"\n");
    }
}
