package br.com.maycon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da primeira nota: ");
        Double nota1 = sc.nextDouble();
        System.out.println("Digite o valor da Segunda nota: ");
        Double nota2 = sc.nextDouble();
        System.out.println("Digite o valor da Terceira nota: ");
        Double nota3 = sc.nextDouble();
        System.out.println("Digite o valor da Quarta nota: ");
        Double nota4 = sc.nextDouble();

        Aluno aluno = new Aluno("Maycon", nota1, nota2, nota3, nota4);

        System.out.println("Situacao do aluno "+aluno.getNome()+": "+ aluno.situacaoAluno());

    }
}
