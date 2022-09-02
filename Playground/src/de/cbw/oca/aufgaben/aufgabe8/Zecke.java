package de.cbw.oca.aufgaben.aufgabe8;

public class Zecke implements Sozialisiert {

	@Override
	public void frisst() {
		System.out.println("Trinkt Blut...");
		
	}

	@Override
	public void schlaeft() {
		System.out.println("Pennt nie");
	}
}
