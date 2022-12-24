package br.com.fit.exemplo.aula2.ex7Gols;

import java.util.Scanner;

public class Gols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int golsA, golsB;

        System.out.println("Digite quantos gols fez o time A");
        golsA = sc.nextInt();
        System.out.println("Digite quantos gols fez o time B");
        golsB = sc.nextInt();
        verificaVencedor(golsA, golsB);

        sc.close();
    }
    
    public static void verificaVencedor(int golsA, int golsB){
        if(golsA == golsB){
            System.out.println("O jogo foi um empate");
        } else {
            System.out.println("O time " + (golsA > golsB ? "A" : "B") + " foi o vencedor!!");
        }
    }
}
