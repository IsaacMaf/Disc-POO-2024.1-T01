package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   double sal = 0;
	   System.out.println("digite seu salário: ");
	   sal = sc.nextDouble();
	   double grat = sal*5/100;
	   double imp = sal*7/100;
	   double salreceber = (grat + sal) - imp;
	   System.out.println("O salário para receber é de: " + salreceber);
	}

}
