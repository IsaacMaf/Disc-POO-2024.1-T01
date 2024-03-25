package br.edu.principal;

import java.util.Scanner;

public class principal {
	/*
	 * Faça um programa que receba o custo de um espetáculo teatral e o preço do convite desse espetáculo.
       Esse programa deverá calcular e mostrar a quantidade de convites que devem ser vendidos para que,
       pelo menos, o custo do espetáculo seja alcançado.
	 */

	public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	double custo, convite, qtd, Aqtd = 0;
	System.out.println("Qual o custo do teatro?");
	custo = sc.nextDouble();
	System.out.println("\n Qual o custo do ingresso/convite?");
	convite = sc.nextDouble();
	qtd = custo/convite;
	Aqtd = Math.ceil(qtd);
	System.out.println("\n\n A quantidade de ingressos a serem vendidas para alcançar os custos do teatro são de: "+ Aqtd+" entradas." );	
    sc.close();
	}
}
