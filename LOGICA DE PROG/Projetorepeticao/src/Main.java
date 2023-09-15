import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva um numero");
		
		int x = ler.nextInt();
		int soma = 0;
	
		while(x != 0) {
			soma = soma + x;
			x = ler.nextInt();
		}
		
		System.out.println("A soma total foi de: " +soma);
		ler.close();
	}

}
