package br.edu.principal;

import java.util.Scanner;

public class principal {
	/*
	 * Faça um programa que receba uma hora formada por hora e minutos (um número real), calcule e
       mostre a hora digitada apenas em minutos. Lembre-se de que:
        
          ■■ para quatro e meia, deve-se digitar 4.30;
          ■■ os minutos vão de 0 a 59.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double hora, h, min, conversao, resultado = 0; 
		System.out.println("Por favor, escrever o horário com vírgula(ex: 4:30 -> 4,30)");
        System.out.println("\n\n Qual o horário?");
        hora = sc.nextDouble();
        h = Math.floor(hora);
        conversao = h * 60;
        min = (hora - h)* 100;
        resultado = conversao + min;
        System.out.println("\n A conversão do horário é de: "+ resultado);
        sc.close();
	}

}
