package de.cbw.projects.management;

public class Person {
	
	// Klassenvariablen: gehören der Klasse (dem Bauplan)
	private static int count;
	
	// Instanzvariablen: gehören dem Objekt
	private final int id;
	
	private String firstName;
	
	private String lastName;

	public Person(String firstName, String lastName) {
		this.id = ++count;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}
}
