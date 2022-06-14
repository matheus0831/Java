package java1;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int prato;
		int sobremesa;
		int bebida;
		int quantidade = 0;
		
		System.out.println("Escolha um prato (1 - Vegetariano, 2 - Peixe, 3 - Frango e 4 - Carne): ");
		prato = entrada.nextInt();
		
		switch(prato) {
		case 1:
			quantidade = quantidade + 180;
			System.out.println("Prato vegetariano, voc� tem essa quantidade de calorias no seu prato: " + quantidade);
		break;
		case 2:
			quantidade = quantidade + 230;
			System.out.println("Prato de peixe, voc� tem essa quantidade de calorias no seu prato: " + quantidade);
		break;
		case 3:
			quantidade = quantidade + 250;
			System.out.println("Prato de frango, voc� tem essa quantidade de calorias no seu prato: " + quantidade);
		break;
		case 4:
			quantidade = quantidade + 350;
			System.out.println("Prato de carne, voc� tem essa quantidade de calorias no seu prato: " + quantidade);
		break;
		}
		
		System.out.println("Escolha uma sobremesa (1 - Abacaxi, 2 - Sorvete diet, 3 - Mouse diet e 4 - Mouse de chocolate): ");
		sobremesa = entrada.nextInt();
		
		switch(sobremesa) {
		case 1:
			quantidade = quantidade + 75;
			System.out.println("Abacaxi, voc� tem essa quantidade de calorias no seu prato: " + quantidade);
		break;
		case 2:
			quantidade = quantidade + 110;
			System.out.println("Sorvete diet, voc� tem essa quantidade de calorias no seu prato: " + quantidade);
		break;
		case 3:
			quantidade = quantidade + 170;
			System.out.println("Mouse diet, voc� tem essa quantidade de calorias no seu prato: " + quantidade);
		break;
		case 4:
			quantidade = quantidade + 200;
			System.out.println("Mouse de chocolate, voc� tem essa quantidade de calorias no seu prato: " + quantidade);
		break;
		}
		
		System.out.println("Escolha uma bebida (1 - Ch�, 2 - Suco de laranja, 3 - Suco de mel�o e 4 - Refrigerante diet): ");
		bebida = entrada.nextInt();
		
		switch(bebida) {
		case 1:
			quantidade = quantidade + 20;
			System.out.println("Ch�, voc� tem essa quantidade de calorias no seu prato: " + quantidade);
		break;
		case 2:
			quantidade = quantidade + 70;
			System.out.println("Suco de laranja, voc� tem essa quantidade de calorias no seu prato: " + quantidade);
		break;
		case 3:
			quantidade = quantidade + 100;
			System.out.println("Suco de mel�o, voc� tem essa quantidade de calorias no seu prato: " + quantidade);
		break;
		case 4:
			quantidade = quantidade + 65;
			System.out.println("Refrigerante diet, voc� tem essa quantidade de calorias no seu prato: " + quantidade);
		break;
		}
		
		System.out.println("A quantidade total de calorias �: " + quantidade);
		
		
	}

}
