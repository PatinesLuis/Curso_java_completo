package entities;

public class Product {
	private Integer id;
	private String name;
	private Double preco;
	private Integer qtd;
	
	public Product(Integer id, String name, Double preco, Integer qtd) {
		super();
		this.id = id;
		this.name = name;
		this.preco = preco;
		this.qtd = qtd;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	
	public double total() {
		return qtd * preco;
	}

	@Override
	public String toString() {
		return "id produto=" + id + "- Produto: = " + name + " - preço =" + preco + " - Quantidade= " + qtd + " - total: " + total();
	}
	
	
	
	
	
}
