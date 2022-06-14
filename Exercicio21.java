package java1;

import java.util.Scanner;

class Exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double valor;
		double prestacao;
		System.out.println("Insira o valor da compra: ");
		valor = entrada.nextDouble();
		
		prestacao = valor/5.0;
		
		System.out.println("O valor de cada parcela dividido em 5 vezes será: " + prestacao);

	}

}
