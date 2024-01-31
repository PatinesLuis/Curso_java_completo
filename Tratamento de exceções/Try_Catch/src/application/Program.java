package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		method1();
		
		
		System.out.println("fim");
		
	}

		public static void method1() {
			System.out.println("----metodo 1 começar");
			method2();
			System.out.println("----metodo 1 Final");
		}
	
		public static void method2() {
			System.out.println("----metodo 2 começar");
			Scanner ler = new Scanner(System.in);
			
			try {
				String[] vect = ler.nextLine().split(" ");
				int position = ler.nextInt();
				System.out.println(vect[position]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("posição invalida");
				e.printStackTrace();
				ler.next();
			} catch (InputMismatchException e) {
				System.out.println("numero invalido");
			}
			ler.close();
			System.out.println("----metodo 2 Final");
		}
		
	
}
