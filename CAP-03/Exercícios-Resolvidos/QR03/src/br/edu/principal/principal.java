package br.edu.principal;

import java.util.Scanner;
 /*
  * Faça um programa que receba três notas e
  * seus respectivos pesos,
  * calcule e mostre a média ponderada.
  */

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 ,n2 ,n3 ,peso1 ,peso2 ,peso3 = 0;
		System.out.println("este programa calcula a média entre as notas 1, 2, e  3 utilizando 3 pesos, um em cada, digitar por favor a 1: ");
		n1 = sc.nextDouble();
		System.out.println("digitar a 2 nota");
		n2 = sc.nextDouble();
		System.out.println("digitar a 3 nota");
		n3 = sc.nextDouble();
		System.out.println("digitar o peso 1");
		peso1 = sc.nextDouble();
		System.out.println("digitar o peso 2");
		peso2 = sc.nextDouble();
		System.out.println("digitar o peso 3");
		peso3 = sc.nextDouble();
		double media = (peso1*n1 + peso2*n2 + peso3*n3)/(peso1 + peso2 + peso3);
		System.out.println("a soma de suas notas foram:" + media);
	}

}
