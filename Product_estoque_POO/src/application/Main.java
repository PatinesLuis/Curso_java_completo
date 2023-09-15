package application;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("Entre com os produtos");
		
		System.out.println("Nome:");
		p.nome = ler.next();
		
		System.out.println("Preço:");
		p.preco = ler.nextDouble();
		
		System.out.println("Qtd:");
		p.qtd = ler.nextInt();
		
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
