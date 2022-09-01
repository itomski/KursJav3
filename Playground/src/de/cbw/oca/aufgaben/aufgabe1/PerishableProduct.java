package de.cbw.oca.aufgaben.aufgabe1;

import java.time.LocalDate;

public class PerishableProduct extends Product {
	
	private static final long serialVersionUID = 4458575702424910708L;
	
	private LocalDate expiryDate;
	
	public PerishableProduct() {
	}
	
	public PerishableProduct(int nr, String name, String description, double price, int count, LocalDate expiryDate) {
		super(nr, name, description, price, count);
		this.expiryDate = expiryDate;
	}
	
	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", ");
		builder.append(expiryDate);
		return builder.toString();
	}
}
