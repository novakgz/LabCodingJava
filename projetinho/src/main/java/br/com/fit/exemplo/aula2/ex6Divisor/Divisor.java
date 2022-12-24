package br.com.fit.exemplo.aula2.ex6Divisor;

import java.util.Scanner;

public class Divisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um número");
        num = sc.nextInt();

        for(int i=1; i<=6; i++){
            long div =  Math.round(Math.pow(2, i));
            System.out.println("O número " + num + (num%div==0 ? "" : " não ") + " é divisível por " + div);    
        }

        sc.close();
    }
}
