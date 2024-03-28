package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double area, raio = 0;
      System.out.println("digitar por favor o raio da circunferência: ");
      raio = sc.nextDouble();
      area = 3.1415*Math.pow(raio, 2);
      System.out.printf("a área de sua circunferência é de: %.4f", area);
	}

}
