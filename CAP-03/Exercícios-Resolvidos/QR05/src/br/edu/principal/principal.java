package br.edu.principal;

import java.util.Scanner;
  /*
   * Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre
o valor do aumento e o novo salário.
   */

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, novosal, perc, aumento = 0;
        System.out.println("o programa calcula o valor de um salário após um aumento específico");
        System.out.println("digitar o salário anterior ao aumento: ");
        sal = sc.nextDouble();
        System.out.println("digitar a porcentagem do aumento: ");
        perc = sc.nextDouble();
        aumento = sal*perc/100;
        System.out.println("este foi o aumento: " + aumento);
        novosal = sal + aumento;
        System.out.println("este é o salário após o aumento: " + novosal);
        
	}

}
