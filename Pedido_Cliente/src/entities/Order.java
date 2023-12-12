package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enuns.orderStatus;

public class Order {
	
	private Date moment;
	private orderStatus status;
	
	List<OrderItem> itens = new ArrayList<OrderItem>();
	private Client client;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Order() {
		
	}

	public Order(Date moment, orderStatus status, Client cliente) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public orderStatus getStatus() {
		return status;
	}

	public void setStatus(orderStatus status) {
		this.status = status;
	}


	public Client getClient() {
		return client;
	}

	public void setClient(Client cliente) {
		this.client = cliente;
	}	
	
	public void addItem(OrderItem item) {
		itens.add(item);
	}
	
	public void removeItem(OrderItem item) {
		itens.remove(item);
	}
	
	public double total() {
		double sum = 0;
		
		for(OrderItem it : itens) {
			sum = sum + it.subTotal();
		}
		
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order Status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items: ");
		for(OrderItem it : itens) {
			sb.append(it + "\n");
		}
		sb.append("total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
}
