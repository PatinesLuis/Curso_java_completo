package aulaForWhile_lacoDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double c = 0;
		
		char escolha;
		do {
			
			System.out.println("Digite a temperatuda em celcius");
			c = ler.nextInt();
			double f = (9*c/5) + 32;
			System.out.println("Equivalente a fahrenheit: " + f);
			System.out.println("Deseja repetir? (S/N)");
			escolha = ler.next().charAt(0);
		}while(escolha != 'n');

	}

}
