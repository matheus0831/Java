package java1;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira sua idade: ");
		idade = entrada.nextInt();
		
		if(idade < 16) {
			System.out.println("Nao eleitor");
		}else if(idade >= 18 && idade < 65) {
			System.out.println("Eleitor obrigatorio");
		}else {
			System.out.println("Eleitor facultativo");
		}

	}

}
