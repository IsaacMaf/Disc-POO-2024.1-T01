package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double num1, num2, r1, r2 = 0;
       System.out.println("qual o primeiro número? este vai ser a base do primeiro e o expoente do segundo.");
       num1 = sc.nextDouble();
       System.out.println("e o segundo? este será o expoente do primeiro e a base do segundo");
       num2 = sc.nextDouble();
       r1 = Math.pow(num1, num2);
       r2 = Math.pow(num2, num1);
       System.out.println("o resultado de " + num1 + " elevado a " + num2 + " é " + r1);
       System.out.println("o resultado de " + num2 + " elevado a " + num1 + " é " + r2);
	}

}
