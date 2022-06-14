package java1;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		double numero;
		int qtde1 = 0;
		int qtde2 = 0;
		int qtde3 = 0;
		while(i < 20) {
			System.out.println("Insira um número: ");
			numero = entrada.nextDouble();
			if(numero >= 0 && numero <= 100) {
				qtde1++;
			}
			i++;
		}
		System.out.println("Os numeros entre 0 e 100 são: " + qtde1);
		
	

	}

}
