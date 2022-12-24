package br.com.fit.exemplo.aula2.ex3Vacinas;

import java.util.Scanner;

public class Vacinas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade");
        idade = sc.nextInt();

        System.out.println("Sua vacina deverá ser " + (idade >= 45 && idade <= 55 ? "Aztrazenica" : "Pfizer ou Moderna"));

        sc.close();
    }

}
