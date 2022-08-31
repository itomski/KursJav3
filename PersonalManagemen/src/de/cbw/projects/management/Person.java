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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [id=")
				.append(id)
				.append(", firstName=")
				.append(firstName)
				.append(", lastName=")
				.append(lastName)
				.append("]");
		return builder.toString();
	}

//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Person [id=");
//		builder.append(id);
//		builder.append(", firstName=");
//		builder.append(firstName);
//		builder.append(", lastName=");
//		builder.append(lastName);
//		builder.append("]");
//		return builder.toString();
//	}
	
	
	
	
//	@Override
//	public String toString() {
//		return firstName + " " + lastName + ", ID: " + id; 
//	}
	
	
}
