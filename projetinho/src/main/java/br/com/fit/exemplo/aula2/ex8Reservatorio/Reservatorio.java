package br.com.fit.exemplo.aula2.ex8Reservatorio;

import java.util.Scanner;

public class Reservatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alt, larg, comp, litros, capacidade, dias;
        long horas;

        System.out.println("Digite a altura do reservatório em centímetros");
        alt = sc.nextDouble();
        System.out.println("Digite a largura do reservatório em centímetros");
        larg = sc.nextDouble();
        System.out.println("Digite o comprimento do reservatório em centímetros");
        comp = sc.nextDouble();
        System.out.println("Digite o consumo médio diário dos utilizadores do reservatório em litros");
        litros = sc.nextDouble();

        capacidade = alt*larg*comp/1000;
        dias = capacidade / litros;
        horas = Math.round(dias%Math.floor(dias)*24);
        
        System.out.println("A capacidade do reservatório é de " + String.format("%.3f", capacidade) + " litros!!");
        System.out.println("A autonomia do reservatório é de " + Math.round(Math.floor(dias)) + " dias e " + horas + " horas!!");
        System.out.print("Seu consumo foi classificado como ");
        if(dias < 3){
            System.out.println("elevado");
        } else if(dias > 8){
            System.out.println("reduzido");
        } else {
            System.out.println("moderado");
        }

        sc.close();
    }
    
}
