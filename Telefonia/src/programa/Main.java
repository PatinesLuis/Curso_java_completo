package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int minutos = 0;
		int cont = 0;
		float pagar = 50;

		System.out.println("Quantos minutos ficou em linha?");
		minutos = ler.nextInt();

		if (minutos > 100) {
			cont = (minutos - 100) * 2;
			pagar = pagar + cont;
		} else {
			pagar = pagar;
		}
		System.out.println(pagar);

	}

}
