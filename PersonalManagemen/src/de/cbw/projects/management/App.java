package de.cbw.projects.management;

import java.util.Scanner;

public class App {
	
	private static final String KEYS = "\n-------------------------------------"
										+ "\n\tn = Neue Person"
										+ "\n\tl = Personalliste"
										+ "\n\tx = exit"
										+ "\n-------------------------------------\n";
	
	
	private Person[] personal = new Person[100];
	
	// System.out = Outputstream
	private Scanner scanner = new Scanner(System.in); // System.in = Inputstream
	
	// Klassenmethode
	public static void main(String[] args) {
		new App().start();
	}

	// Instanzmethode
	private void start() {
		
		boolean exit = false;
		
		System.out.println(KEYS);
		
		app: while(true) { // Endlos-Schleife
			
			switch(scanner.nextLine().trim().toLowerCase()) {
				
				case "n":
					personal[nextFreeIndex()] = createPerson();
					System.out.println();
					break;
					
				case "l":
					showPersonal();
					break;
				
				case "help":
				case "h":
					System.out.println(KEYS);
					break;
					
				case "x":
					break app;
					
				default:
					System.out.println("Ungültige Auswahl");
			}
		}
		
		System.out.println("Ende");
	}
	
	private Person createPerson() {
		
		System.out.print("Vorname: ");
		String firstName = scanner.nextLine(); // Wartet bis eine Eingabe erfolgt
		
		System.out.print("Nachname: ");
		String lastName = scanner.nextLine();
		
		return new Person(firstName, lastName);
	}
	
	private int nextFreeIndex() {
		
		for(int i = 0; i < personal.length; i++) {
			if(personal[i] == null)
				return i;
		}
		return -1;
	}
	
	private void showPersonal() {
		
		System.out.println();
		System.out.println("Personalliste:");
		
		for(Person p : personal) {
			
			if(p == null)
				break;
			
			System.out.println(p.getFirstName() + " " + p.getLastName());
		}
		
		System.out.println();
	}
	
}
