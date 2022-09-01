package de.cbw.oca.playground;

public class LambdaTest {

	public static void main(String[] args) {
		
		sagHallo(new Mensch());
		sagHallo(new Vulkanier());
		
		// anonyme Klasse
		Spezies borg = new Spezies() { // Klasse ohne Namen, implementiert Spezies, wird instanziert und danach weggeworfen
			public void hallo() {
				System.out.println("Wir sind ein Kollektiv...");
			}
		};
		
		sagHallo(borg);
		
		sagHallo(() -> System.out.println("Grrrr Hrrr Agghhh..."));

	}
	
	public static void sagHallo(Spezies s) {
		s.hallo();
	}
}

// SAM - Single Abstract Method
@FunctionalInterface
interface Spezies {
	void hallo();
}

class Mensch implements Spezies {
	
	public void hallo() {
		System.out.println("Hallo...");
	}
}

class Vulkanier implements Spezies {
	
	public void hallo() {
		System.out.println("Hi Fremder...");
	}
}