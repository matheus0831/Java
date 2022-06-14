package java1;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f;
		double c;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira uma temperatura em Celsius: ");
		c = entrada.nextDouble();
		
		f = ((9*c+160)/5);
		
		System.out.println("A temperatura em Fahrenheit é: " + f);

	}

}
