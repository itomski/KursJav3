package de.cbw.oca.aufgaben.aufgabe8;

public class Wolf implements Sozialisiert {

	@Override
	public void frisst() {
		System.out.println("Frisst viel Fleisch...");
	}

	@Override
	public void schlaeft() {
		System.out.println("Schlafen ist was für Anfänger... ich jage");
	}

}
