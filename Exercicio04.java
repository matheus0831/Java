package java1;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		double numero = 0;
		double maior = 0;
		double menor = 0;
		double meio = 0;
		while(i < 3) {
			System.out.println("Insira um numero: ");
			numero = entrada.nextDouble();
			if(i == 0) {
				maior = numero;
				menor = numero;
				meio = numero;
			}else {
				if(numero < menor) {
					menor = numero;
				}else if(numero > maior){
					maior = numero;
				}
			}
			i++;
			}
		System.out.println(maior);
		System.out.println(meio);
		System.out.println(menor);
		
		
	}

}
