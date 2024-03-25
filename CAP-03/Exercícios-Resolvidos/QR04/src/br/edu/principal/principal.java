package br.edu.principal;

import java.util.Scanner;
/*
 * Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se
 *que este sofreu um aumento de 25%.
 */

public class principal {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double salario, novosalario = 0;
     System.out.println("o programa calcula o seu salário após um aumento de 25%");
     System.out.println("digite o salario anterior ao aumento:");
     salario = sc.nextDouble();
     novosalario = salario*25/100 + salario;
     System.out.println("o seu novo salário com o aumento é de: " + novosalario);
	}

}
