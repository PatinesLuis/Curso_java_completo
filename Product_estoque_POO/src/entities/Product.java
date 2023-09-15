package entities;

public class Product {
	
	public String nome;
	public double preco;
	public int qtd;
	
	public double totalvalorestoque() {
		double soma = preco * qtd;
		
		return soma;
	}
	
	public void addProduto(int qtd) {
		this.qtd += qtd; 
		
	}
	
	public void removeProduto (int qtd) {
		this.qtd -= qtd;
	}
	
	public String toString() {
		return nome + ", R$ " + String.format("%.2f", preco) + ", quatidade " + qtd + ", Valor total: "
				+ String.format("%.2f", totalvalorestoque()); 
	}
	
}
