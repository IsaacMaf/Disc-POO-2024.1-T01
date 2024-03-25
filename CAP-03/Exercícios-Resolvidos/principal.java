package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ATENÇÃO!! escala em metros!");
		double x,y= 0;
		System.out.println("\n qual o tamanho da escada?");
		y = sc.nextDouble();
		System.out.println("\n qual a altura que você deseja colocar o quadro?");
		x = sc.nextDouble();
		
		double z = Math.pow(y, 2) - Math.pow(x, 2);
		z = Math.sqrt(z);
		System.out.printf("\n A distância que a escada deve ficar é de %.2f",z);
		sc.close();
	}

}
