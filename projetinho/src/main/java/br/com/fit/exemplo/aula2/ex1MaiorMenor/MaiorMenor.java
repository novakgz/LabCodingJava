package br.com.fit.exemplo.aula2.ex1MaiorMenor;

import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double num1, num2;

        System.out.println("Digite o primeiro número");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo número");
        num2 = sc.nextDouble();
        verificaMaior(num1, num2);

        sc.close();
    }

    public static void verificaMaior(Double n1, Double n2){
        if(n1.equals(n2)){
            System.out.println("Os números são iguais!!");
        } else {
            System.out.println("O número " + (n1 > n2 ? n1 : n2) + " é o maior!!");
        }
    }
    
}
