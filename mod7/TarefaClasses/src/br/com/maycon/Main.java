package br.com.maycon;

/**
 * @author maycon.garcia
 */
public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setCod(1);
        curso.setNomeCurso("Especialista Java Backend");
        curso.setCoordenador("Rodrigo Pires");
        curso.setCargaHoraria(60);
        curso.setValorCurso(4000.00);

        System.out.println(curso.imprimir());
    }
}
