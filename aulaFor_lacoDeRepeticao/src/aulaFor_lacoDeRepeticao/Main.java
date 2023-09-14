package aulaFor_lacoDeRepeticao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Quantas vezes deve repetir");
		int n = ler.nextInt();
		int soma = 0;
		
		for(int i=0; i< n; i++) {
			System.out.println("digite a soma; ");
			int x = ler.nextInt();
			
			soma = soma + x;
		}
		System.out.println("A soma foi de: " + soma);
		ler.close();
	}

}
