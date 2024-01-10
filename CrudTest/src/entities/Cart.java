package entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	List<Product> products = new ArrayList<>();
	
	public void Card() {
		
	}
	
	public void addProduct(Product item) {
		products.add(item);
	}
	
	public void removeProduct(int idProduct) {
		List<Product> listRemove = new ArrayList<>();
		for(Product item : products) {
			if(item.getId() == idProduct) {
				listRemove.add(item);
				System.out.println("PRODUTO REMOVIDO - " + item.getName());
			}
		}	
		products.removeAll(listRemove);
	}
	
	public void listProducts() {
		
		boolean toCheck = products.isEmpty();
		
		if(toCheck) {
			System.out.println("LISTA VAZIA");
			System.out.println("");
		}
		for(Product p : products) {
			System.out.println(p);
			System.out.println("");
		}
		
	}
	
	public void editProduct(int idProduct, int opcao) {
		
		System.out.println("O que deseja modificar do item de id "+ idProduct + " ?");
		System.out.println("1 nome:");
		System.out.println("2 Preço:");
		System.out.println("3 QTD:");
		
//		for(Product p : products) {
//			if(p.getId() == idProduct) {
//				p.setName(newName);
//			}
//		}
		
		switch (opcao) {
		case 1:
			System.out.println("Digite o novo nome: ");
			
			
			break;

		default:
			break;
		}
	}
	
	public double totalCart() {
		double total = 0;	
		
		for(Product p : products ) {
			total += p.total();
		}
		return total;
	}
	
	public int qtdCart() {
		int qtd = products.size();
		return qtd;
	}
}
