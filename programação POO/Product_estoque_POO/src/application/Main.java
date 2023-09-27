package application;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Entre com os produtos");
		
		System.out.println("Nome:");
		String nome = ler.next();
		
		System.out.println("Preço:");
		double preco = ler.nextDouble();
		
		System.out.println("Qtd:");
		int qtd = ler.nextInt();
		
		Product p = new Product(nome, preco, qtd);
	
		System.out.println(p);
		
		System.out.println("Adicione um novo estoque: ");
		int quantidade = ler.nextInt();
		p.addProduto(quantidade);
		System.out.println(p);
		
		System.out.println("Remova do estoque: ");
		quantidade = ler.nextInt();
		p.removeProduto(quantidade);
		System.out.println(p);

	}

}
