package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double base, altura, area = 0;
       System.out.println("digitar por favor a base do triângulo: ");
       base = sc.nextDouble();
       System.out.println("agora, digitar a altura do triângulo: ");
       altura = sc.nextDouble();
       area = (base*altura)/2;
       System.out.println("a área de seu triangulo é de: " + area);
	}

}
