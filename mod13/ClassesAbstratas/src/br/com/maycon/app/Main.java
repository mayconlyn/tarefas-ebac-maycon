package br.com.maycon.app;

import br.com.maycon.entities.Imovel;
import br.com.maycon.entities.Pessoa;
import br.com.maycon.entities.PessoaFisica;
import br.com.maycon.entities.PessoaJuridica;

public class Main {

    public static void main(String[] args) {
        Imovel imovelF = new Imovel(200000d);
        Imovel imovelJ = new Imovel(600000d);

        PessoaFisica pessoaFisica = new PessoaFisica("Maycon", "082.999.925-86",
                imovelF);

        PessoaJuridica pessoaJuridica = new PessoaJuridica("EBAC ENSINO A DISTANCIA  LTDA",
                "37.598.548/0001-95", imovelJ);

        imprimir(pessoaFisica);
        imprimir(pessoaJuridica);
    }

    private static void imprimir(Pessoa pessoa) {
        pessoa.imprimirDados();
    }
}
