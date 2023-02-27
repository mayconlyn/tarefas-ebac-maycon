package br.com.maycon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int num = sc.nextInt();
        Integer numW = num;

        System.out.println(numW);

        sc.close();
    }
}
