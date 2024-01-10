package application;

import java.util.Scanner;

import entities.Cart;
import entities.Product;

public class Principal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Cart cart = new Cart();		
		int opcao;
		do{
			
			System.out.println("O que deseja fazer?");
			System.out.println(" 1 - Adicionar produto");
			System.out.println(" 2 - Listar produtos");
			System.out.println(" 3 - Remover produtos do carrinho");
			System.out.println(" 0 - Sair");
			opcao = ler.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite um id para o produto: ");
				Integer id = ler.nextInt();
				
				System.out.println("Digite um NOME para o produto: ");
				String nome = ler.next();
				
				System.out.println("Digite um PREÇO para o produto: ");
				Double preco = ler.nextDouble();
				
				System.out.println("Digite um QTD para o produto: ");
				Integer qtd = ler.nextInt();
				
				Product p = new Product(id, nome, preco, qtd);
				System.out.println("PRODUTOS");
				cart.addProduct(p);
				
				break;
			case 2:
				System.out.println("CARRINHO:");
				System.out.println(" ");
				System.out.println("Valor do carrinho:" + cart.totalCart());
				cart.listProducts();
				break;
				
			case 3:
				System.out.println("Qual produto deseja remover do carrinho? (DIGITE O ID)");
				id = ler.nextInt();
		
				cart.removeProduct(id);
				break;
			default:
				System.out.println("Opção invalida");
				break;
			}
		}while(opcao != 0);
		System.out.println("SAINDO.....");
	}

}
