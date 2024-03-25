package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		/*
		 * Uma pessoa deseja pregar um quadro em uma parede. Faça um programa para calcular e mostrar a
           que distância a escada deve estar da parede. A pessoa deve fornecer o tamanho da escada e a altura em
           que deseja pregar o quadro.Lembre-se de que o tamanho da escada deve ser maior que a altura que se 
           deseja alcançar.
           
           X – Altura em que deseja pregar o quadro
           Y – Distância em que deverá ficar a escada
           Z – Tamanho da escada
		 */
		
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
