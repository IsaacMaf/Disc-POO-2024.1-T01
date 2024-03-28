package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double rend, dep, taxa, total = 0;
      System.out.println("o programa calcula o juros, a renda e o valor total após a renda de um depósito.");
      System.out.println("digitar por favor o valor do depósito: ");
      dep = sc.nextDouble();
      System.out.println("digitar agora a taxa de juros desse depósito: ");
      taxa = sc.nextDouble();
      rend = dep * taxa/100;
      System.out.println("este é o valor do seu rendimento: " + rend);
      total = rend + dep;
      System.out.println("e este é o valor total após o rendimento: " + total);
	}

}
