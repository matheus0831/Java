package java1;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		int idade = 0;
		int i = 0;
		
		while(i < 20) {
			System.out.println("Insira uma idade: ");
			idade = entrada.nextInt();
			if(idade >= 18) {
				soma++;
			}
			i++;
		}
		System.out.println("O numero de pessoas maiores de idade eh: " + soma);

	}

}
