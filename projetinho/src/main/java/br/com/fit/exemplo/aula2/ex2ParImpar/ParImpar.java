package br.com.fit.exemplo.aula2.ex2ParImpar;

import java.util.Scanner;

public class ParImpar {

    public static void main(String args[]){
        int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        System.out.println("O número " + num + " é " + (num % 2 == 0 ? "par!!" :"impar!!"));

        sc.close();
    }
    
}
