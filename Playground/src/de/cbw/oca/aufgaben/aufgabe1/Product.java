package de.cbw.oca.aufgaben.aufgabe1;

import java.io.Serializable;

public class Product implements Comparable<Product>, Serializable {
	
	private static final long serialVersionUID = -6374452208277822785L;
	
	private int nr;
	private String name;
	private String description;
	private double price;
	private int count;
	
	public Product() {
	}
	
	public Product(int nr, String name, String description, double price, int count) {
		this.nr = nr;
		this.name = name;
		this.description = description;
		this.price = price;
		this.count = count;
	}

	public int getNr() {
		return nr;
	}
	
	public void setNr(int nr) {
		this.nr = nr;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nr);
		builder.append(", ");
		builder.append(name);
		builder.append(", ");
		builder.append(description);
		builder.append(", ");
		builder.append(price);
		builder.append(", ");
		builder.append(count);
		return builder.toString();
	}

	@Override
	public int compareTo(Product other) {
		return name.compareToIgnoreCase(other.name);
	}
}
