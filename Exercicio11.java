package java1;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String nome;
		Double salario;
		Double vendas;
		Double comissao;
		System.out.println("Insira seu nome: ");
		nome = entrada.nextLine();
		System.out.println("Insira seu sálario: ");
		salario = entrada.nextDouble();
		System.out.println("Insira o lucro das suas vendas: ");
		vendas = entrada.nextDouble();
		
		comissao = (vendas*(15.00/100.00));
                System.out.println(comissao);

	}

}
