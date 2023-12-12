package entities;

public class OrderItem {
	private Integer quantity;
	private double price;
	
	private product p;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, double price, product p) {
		this.quantity = quantity;
		this.price = price;
		this.p = p;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public product getP() {
		return p;
	}

	public void setP(product p) {
		this.p = p;
	}
	
	public double subTotal() {
		return quantity * price;
	}
	
	@Override
	public String toString() {
		return getP().getName() +", $" + getP().getPrice() + ",  " + 
	getQuantity() + ", Subtotal: " + subTotal();
	}
	
}
