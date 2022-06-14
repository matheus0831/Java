package java1;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double numero = 0;
		double soma = 0;
		while(numero >= 0) {
			System.out.println("Insira um número: ");
			numero = entrada.nextDouble();
			if(numero >= 0) {
				soma = soma + numero;
			}
		}
		System.out.println(soma);

	}

}
