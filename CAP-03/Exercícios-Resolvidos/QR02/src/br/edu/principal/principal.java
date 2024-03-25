package br.edu.principal;

import java.util.Scanner;

public class principal {
	/*
	 * Faça um programa que receba três notas, 
	 * calcule e mostre a média aritmética.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		double n1 ,n2 ,n3 , n4 = 0;
		System.out.println("este programa calcula a soma das notas 1, 2, 3 e 4, digitar por favor a 1: ");
		n1 = sc.nextDouble();
		System.out.println("digitar a 2 nota");
		n2 = sc.nextDouble();
		System.out.println("digitar a 3 nota");
		n3 = sc.nextDouble();
		System.out.println("digitar a 4 nota");
		n4 = sc.nextDouble();
		double media = n1 + n2 + n3 + n4;
		System.out.println("a soma de suas notas foram:" + media/4);

	}

}
