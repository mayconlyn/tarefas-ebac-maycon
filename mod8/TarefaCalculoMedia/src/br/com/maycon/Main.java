package br.com.maycon;
/**
 * @author maycon.garcia
 */
public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Maycon", 90.0, 95.0, 95.0, 90.0);
        System.out.println("A média do aluno "+aluno.getNome()+": "+aluno.calculoMedia());

    }
}
