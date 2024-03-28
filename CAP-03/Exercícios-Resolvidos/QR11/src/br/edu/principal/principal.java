package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, quad, cubo, r2, r3 = 0;
		System.out.println("digitar um número qualquer maior que zero: ");
		num = sc.nextDouble();
		quad = Math.pow(num, 2);
		cubo = Math.pow(num, 3);
		r2 = Math.sqrt(num);
		r3 = Math.cbrt(num);
		System.out.println("esse é o valor do seu número ao quadrado: " + quad);
		System.out.println("\n esse é o valor do seu número ao cubo: " + cubo);
		System.out.println("\n a raiz quadrada dele: " + r2);
		System.out.println("\n e a raiz cúbica: " + r3);
	}

}
