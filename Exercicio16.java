package java1;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		int idade = 0;
		int total = 0;
		double media;
		
		while(i < 20) {
			System.out.println("Insira uma idade: ");
			idade = entrada.nextInt();
			total = total + idade;
			i++;
		}
		media = (double)total/20.00;
		System.out.println("A media das idades inseridas é: " + media);

	}

}
