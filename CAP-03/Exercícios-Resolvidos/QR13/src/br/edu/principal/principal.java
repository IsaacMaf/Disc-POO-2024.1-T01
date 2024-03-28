package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double pes, polegadas, jardas, milhas = 0;
      System.out.println("digitar a distância em pés: ");
      pes = sc.nextDouble();
      polegadas = pes * 12;
      jardas = pes * 3;
      milhas = jardas/1760;
      System.out.println("o valor em polegadas é: " + polegadas);
      System.out.println("o valor em jardas é: " + jardas);
      System.out.println("o valor em milhas é: " + milhas);
	}

}
