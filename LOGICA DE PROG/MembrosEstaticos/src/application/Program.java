package application;

import java.util.Locale;
import java.util.Scanner;

import util.calculator;

public class Program {
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre Radius");
		double radius = ler.nextDouble();
		
		double c = calculator.circumference(radius);
		double v = calculator.volume(radius);
		
		System.out.printf("Circuference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("PI value: %.2f%n", calculator.PI);
		
		
		ler.close();
	}
	
	

}
