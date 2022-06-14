package java1;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double salario;
		double reajuste;
		
		System.out.println("Informe o seu sálario: ");
		salario = entrada.nextDouble();
		
		reajuste = salario - (salario*(1.5/100));
		
		System.out.println("Seu salario após o reajuste sera de " + reajuste);

	}

}
