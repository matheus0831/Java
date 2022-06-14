package java1;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		int idade = 0;
		int total = 0;
		
		while(i < 20) {
			System.out.println("Insira uma idade: ");
			idade = entrada.nextInt();
			total = total + idade;
			i++;
		}
		System.out.println("A soma das idades inseridas é: " + total);

	}

}
