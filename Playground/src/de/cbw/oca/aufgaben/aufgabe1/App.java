package de.cbw.oca.aufgaben.aufgabe1;

import java.time.LocalDate;

public class App {
	
	private Service<Product> service = new SerializeProductService();

	public static void main(String[] args) {
		new App().go();
	}

	private void go() {
		
		int nr = 0;
		
		service.save(new Product(++nr, "Hammer", "Bla bla bla", 15.99, 10));
		service.save(new Product(++nr, "Zange", "Bla bla bla", 10.99, 50));
		service.save(new Product(++nr, "Handy", "Bla bla bla", 379.00, 20));
		service.save(new Product(++nr, "Trinkflasche", "Bla bla bla", 17.99, 15));
		service.save(new Product(++nr, "Tasse", "Bla bla bla", 3.99, 100));
		service.save(new Product(++nr, "Laptop", "Bla bla bla", 599.99, 2));
		service.save(new Product(++nr, "Lampe", "Bla bla bla", 99.99, 5));
		
		// PerishableProduct IS-A Product
		service.save(new PerishableProduct(++nr, "Melone", "...", 5.99, 100, LocalDate.of(2022, 10, 15)));
		
		service.getAll().forEach(p -> System.out.println(p));
	}
}
