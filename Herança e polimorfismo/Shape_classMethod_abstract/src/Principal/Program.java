package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {
	
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.println("Entre com o numero de formas:");
		int n = ler.nextInt();
		
		for(int i =1; i<=n;i++) {
			System.out.println("Figura: " + i);
			
			System.out.println("Retangulo ou circulo (r/c)");
			char ch = ler.next().charAt(0);
			
			System.out.println("Qual a cor da forma (BLACK, BLUE, RED)");
			Color color = Color.valueOf(ler.next());
			
			if(ch == 'r') {
				System.out.println("largura");
				Double width = ler.nextDouble();
				
				System.out.println("Altura");
				Double height = ler.nextDouble();
				
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.println("Raio:");
				Double radius = ler.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("forma areas:");
		
		for(Shape shape: list) {
			System.out.println(String.format("%.2f",  shape.area()) + " - " + shape.getColor());
		}
		ler.close();
	}
}
