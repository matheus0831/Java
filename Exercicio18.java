package java1;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int menor = 0;
		int idade = 0;
		int i = 0;
		
		while(i < 10) {
			System.out.println("Insira uma idade: ");
			idade = entrada.nextInt();
			if(i == 0) {
				menor = idade;
			}else {
				if(idade < menor) {
					menor = idade;
				}
			}
			i++;
			
		}
		System.out.println("A pessoa mais nova tem essa idade: " + menor);

	}

}
