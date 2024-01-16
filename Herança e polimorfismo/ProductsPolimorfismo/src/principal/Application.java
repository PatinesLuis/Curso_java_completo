package principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Application {
	
	public static void main(String[] args) {
			
		Scanner ler = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.println("Entre com o numero dos produtos: ");
		
		int qtd = ler.nextInt();
		
		for(int i=1; i<=qtd; i++) {
			System.out.println("produto #" + i);
			
			System.out.println("comum, usado ou importado (c/u/i)");
			String tipo = ler.next();
			
			System.out.println("Nome: ");
			String name = ler.next();
			
			System.out.println("Preço: ");
			Double price = ler.nextDouble();
			
			if("i".equals(tipo)) {
				System.out.println("Custo do frete: ");
				Double fee = ler.nextDouble();				
				
				list.add(new ImportedProduct(name, price, fee));
			}
			
			else if("u".equals(tipo)) {
				System.out.println("data de fabricação");
				LocalDate date = LocalDate.parse(ler.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			}
			
			else if("c".equals(tipo)) {
				list.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for(Product p: list) {
			System.out.println(p.priceTag());
		}
	}
}
