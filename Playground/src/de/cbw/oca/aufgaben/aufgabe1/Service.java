package de.cbw.oca.aufgaben.aufgabe1;

import java.util.List;

public interface Service<T> {
	
	void save(T p);
	
	List<T> getAll();

}
