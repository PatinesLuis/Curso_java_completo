package entities;

public class Product {
	
	private String nome;
	private double preco;
	private int qtd;
	
	public Product(String nome, double preco, int qtd) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

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
