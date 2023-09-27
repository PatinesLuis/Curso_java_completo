package principal;

import java.util.Locale;
import java.util.Scanner;

import util.converterDolar;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner ler = new Scanner(System.in);
		converterDolar c = new converterDolar();
		
		System.out.println("Valor dolar");
		c.valorDolar = ler.nextDouble();
		
		System.out.println("Pegar valor dolar: ");
		c.pegarDolar = ler.nextDouble();
		
		System.out.println("valor pago em reais: " + c.convercaoDolar());
		

	}

}
