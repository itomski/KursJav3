package de.cbw.oca.aufgaben.aufgabe1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractProductService implements Service<Product> {
		
	protected List<Product> products = new ArrayList<>();
	
	@Override
	public void save(Product p) {
		products.add(p);
	}

	@Override
	public List<Product> getAll() {
		return Collections.unmodifiableList(products);
	}
}