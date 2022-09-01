package de.cbw.oca.aufgaben.aufgabe1;

import java.util.Collections;

public class MemProductService extends AbstractProductService {
	
	@Override
	public void save(Product p) {
		super.save(p);
		Collections.sort(products);
	}	
}
