package java1;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double numero;
		int i = 0;
		int soma = 0;
		while(i < 20) {
			System.out.println("Insira um numero: ");
			numero = entrada.nextDouble();
			if(numero > 8) {
				soma++;
			}
			i++;
		}
		System.out.println(soma + " dos numeros inseridos sao maiores que 8");

	}

}
