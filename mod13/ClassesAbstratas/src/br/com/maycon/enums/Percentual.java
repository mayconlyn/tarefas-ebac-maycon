package br.com.maycon.enums;

public enum Percentual {
    
    PFISICA(0.01),
    PJURIDICA(0.02);

    private Double valor;

    Percentual(double valor) {
        this.valor=valor;
    }

    public Double getValor() {
        return valor;
    }
}
