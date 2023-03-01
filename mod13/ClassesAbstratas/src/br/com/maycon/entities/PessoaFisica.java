package br.com.maycon.entities;

import br.com.maycon.enums.Percentual;

public class PessoaFisica extends Pessoa{

    private String cpf;

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, String cpf, Imovel imovel) {
        super(nome, imovel, Percentual.PFISICA.getValor());
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Nome: "+ getNome()+"\nCPF: "+cpf);
        System.out.println("Desconto Anual do imposto do Imovel: R$"+
                getImovel().descontoAnualSobreImovel(getPercentualDeDesconto())+"\n");
    }

}
