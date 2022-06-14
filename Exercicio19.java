package java1;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double cotacao;
		double dolar;
		double qtdereal;
		System.out.println("Insira o seu dinheiro em dolares: ");
		dolar = entrada.nextDouble();
		System.out.println("Insira o valor da cotacao do dolar: ");
		cotacao = entrada.nextDouble();
		qtdereal = dolar*cotacao;
		System.out.println("Você tem " + qtdereal + " reais");
		
	}


}
