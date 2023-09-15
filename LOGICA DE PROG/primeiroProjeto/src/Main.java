import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// PRIMEIRO PROGRAMA
//		Locale.setDefault(Locale.US);
//	double x = 456.67823;
//	
//	System.out.printf("%.2f%n" , x);
//	System.out.printf("resultado = %.2f metros%n", x);
//	
//	String nome = "luis";
//	int idade = 21;
//	double renda = 4212.2232;
//	
//	System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);

		// CASTING - MUDANDO TIPO DE VARIAVEIS
//	int b,b2,h, area;
//	
//	b = 6;
//	b2 = 8;
//	h = 5;
//	
//	area = (b + b2) /2;
//	area =  area * 5;
//			
//	System.out.println((double)area);

		// ENTRADA DE DADOS

		Scanner leia = new Scanner(System.in);

		String x;
		x = leia.next();
		System.out.println(x);

		double numero;
		Locale.setDefault(Locale.US);
		numero = leia.nextDouble();
		System.out.println("$ " + numero);

		leia.close();

	}

}
