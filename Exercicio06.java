package java1;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[]args) {
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		numero = entrada.nextInt();
		int sucessor = numero + 1;
		int antecessor = numero - 1;
		
		System.out.println(sucessor);
		System.out.println(antecessor);
		
	}

}
