package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	private LocalDate manufactureDate;

	
	public UsedProduct(String nome, Double price, LocalDate manufactureDate) {
		super(nome, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return getNome() + " (used) $ " + getPrice() + " (manufacture date: " +  manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
	}
}
