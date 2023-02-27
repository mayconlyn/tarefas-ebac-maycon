package br.com.maycon;

/**
 * @author maycon.garcia
 */
public class Curso {

    private int cod;
    private String nomeCurso;
    private String coordenador;
    private int cargaHoraria;
    private double valorCurso;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getValorCurso() {
        return valorCurso;
    }

    public void setValorCurso(double valorCurso) {
        this.valorCurso = valorCurso;
    }

    /**
     * Método que calcula o valor do curso já com o desconto
     * @param percentualDesconto
     * @return
     */
    public double descontoCurso(double percentualDesconto){
        return valorCurso-(valorCurso*percentualDesconto/100);
    }

    /**
     * Metódo que imprime as informações do Curso
     * @return
     */
    public String imprimir() {
        return "Curso " + nomeCurso +
                "\nCod=" + cod +
                "\nCoordenador = " + coordenador +
                "\nCarga Horaria = " + cargaHoraria +"h"+
                "\nValor Curso =" + valorCurso +
                "\nValor do Curso com Desconto: "+ descontoCurso(20);
    }
}
