package java1;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double salario = 0;
		double credito = 0;
		
		System.out.println("Informe seu s�lario: ");
		salario = entrada.nextDouble();
		
		System.out.println(50*100);
		
		if(salario <= 500) {
			System.out.println("Voc� n�o possui nenhum cr�dito");
		}else if(salario <= 1000) {
			credito = (double)(salario * (30.00/100.00));
			System.out.println("Voce possui um credito de: " + credito);
		}else if(salario <= 3000) {
			credito = (double)(salario * (40.00/100.00));
			System.out.println("Voce possui um credito de: " + credito);
		}else if(salario > 3000) {
			credito = (salario * (50.00/100.00));
			System.out.println("Voce possui um credito de: " + credito);
		}
	}

}
