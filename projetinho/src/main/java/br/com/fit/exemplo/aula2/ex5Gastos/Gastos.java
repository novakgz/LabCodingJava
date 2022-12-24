package br.com.fit.exemplo.aula2.ex5Gastos;

import java.util.Scanner;

public class Gastos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double salario, gasto;

        System.out.println("Digite seu salário");
        salario = sc.nextDouble();
        System.out.println("Digite seu total de gastos");
        gasto = sc.nextDouble();

        System.out.println(salario >= gasto ? "Gastos dentro do orçamento" : "Orçamento estourado");

        sc.close();
    }
}
