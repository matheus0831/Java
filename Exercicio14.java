package java1;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		double soma = 0;
		double total = 0;
		
		while(i < 10) {
			System.out.println("Insira um número: ");
			soma = entrada.nextDouble();
			total = total + soma;
			i++;
		}
		System.out.println("A soma dos números inseridos é: " + total);

	}

}
