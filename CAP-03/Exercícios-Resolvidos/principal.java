package br.edu.principal;

import java.util.Scanner;

public class principal {

	/*
	 * Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Faça um programa que receba
       o valor do salário mínimo e a quantidade de quilowatts consumida por uma residência. Calcule e
       mostre:

             a) o valor de cada quilowatt;
             b) o valor a ser pago por essa residência;
             c) o valor a ser pago com desconto de 15%.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salmin,vlrsal, qntkw, reais, vlrdesc  = 0;
		salmin = 1410;
		System.out.println("Leia com atenção: O calculo a seguir é baseado em reais, se a sua moeda não for essa, talvez possa ocorrer erros. Obrigado por ler! \n");
		System.out.println("\n qual é o seu salário?");
		vlrsal = sc.nextDouble();
		System.out.printf("qual a quantidade de QuiloWatts da sua residência?");
		qntkw = sc.nextDouble();
		double vlrkw =(salmin/5);
		reais = qntkw * vlrkw;
		double desc = reais * 0.15;
		vlrdesc = reais - desc;
		System.out.println("\n O valor do QuilloWatts é de: "+ vlrkw);
		System.out.printf("\n Você teria que pagar %.2f", reais ,"mas olhe!");
		System.out.printf("\n\n Que sortudo você é! Temos um desconto para você! o total a pagar deve ser de: %.2f", vlrdesc);
        System.out.println("\n\n E claro, o valor do desconto foi de "+ desc +"reais!");
        sc.close();
	}

}
