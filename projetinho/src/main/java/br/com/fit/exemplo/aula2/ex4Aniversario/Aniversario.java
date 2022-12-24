package br.com.fit.exemplo.aula2.ex4Aniversario;

import java.util.Scanner;

public class Aniversario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, ano;

        do{
            System.out.println("Digite o dia do seu aniversário");
            dia = sc.nextInt();
            if(dia < 1 || dia > 31){
                System.out.println("Dia inválido, digite um valor entre 1 e 31");
            }
        }while(dia < 1 || dia > 31);

        do{
            System.out.println("Digite o mês do seu aniversário");
            mes = sc.nextInt();
            if(mes < 1 || dia > 12){
                System.out.println("Mês inválido, digite um valor entre 1 e 12");
            }
        }while(mes < 1 || mes > 12);

        do{
            System.out.println("Digite o ano do seu nascimento");
            ano = sc.nextInt();
            if(ano > 2021){
                System.out.println("Ano inválido, digite um valor abaixo de 2021");
            }
        }while(ano > 2021);
        sc.close();
    }
    
}
