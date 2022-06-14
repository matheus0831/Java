package java1;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int salario;
		double seuSalario;
		
		System.out.println("Informe o salario minimo: ");
		salario = entrada.nextInt();
		System.out.println("Informe seu salario: ");
		seuSalario = entrada.nextDouble();
		
		 System.out.println("O seu salário equivale a " + (int)seuSalario/salario + " salarios minimos");

	}

}
