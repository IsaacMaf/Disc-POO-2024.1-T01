package br.edu.principal;

import java.util.Scanner;

public class principal {
	/*
	 * Faça um programa que receba um número real, encontre e mostre:
       a) a parte inteira desse número;
       b) a parte fracionária desse número;
       c) o arredondamento desse número.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num,n2 = 0; int n3 = 0; double a = 0;
		System.out.println("Escolha um número real, por favor.");
		num = sc.nextDouble ();
		System.out.println("\n Qual a parte INTEIRA(ex: 1,5 -> 1) do seu número?");
		n3 = sc.nextInt ();
        n2 = num - n3;
        a = Math.round(num);
        
        System.out.println("\n\n a parte não inteira do seu número é: "+ n2);
        System.out.println("\n seu número aproximado é: "+ a);
        sc.close();
	}

}
