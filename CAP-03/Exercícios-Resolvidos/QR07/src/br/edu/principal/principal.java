package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double sal, salreceber, imp = 0;
       System.out.println("o programa calcula o salário de uma pessoa após um aumento de 50 reais e os impostos.");
       System.out.println("qual o seu salário?");
       sal = sc.nextDouble();
       imp = sal*10/100;
       salreceber = (sal + 50) - imp;
       System.out.println("o salário a receber é de: " + salreceber);
	}

}
