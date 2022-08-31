package de.cbw.oca.playground;

import java.time.LocalDate;
import java.util.Objects;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

// Comparable == vergleichbar
public class Person implements Comparable<Person> {
	
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private boolean active;
	
	public Person() {
	}
	
	public Person(String firstName, String lastName, LocalDate birthDate, boolean active) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.active = active;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(firstName != null && firstName.length() > 0) {
			this.firstName = firstName;
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Person [firstName=");
//		builder.append(firstName);
//		builder.append(", lastName=");
//		builder.append(lastName);
//		builder.append(", birthDate=");
//		builder.append(birthDate);
//		builder.append(", active=");
//		builder.append(active);
//		builder.append("]");
//		return builder.toString();
//	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(active, birthDate, firstName, lastName);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		
//		if (obj == null)
//			return false;
//		
//		if (getClass() != obj.getClass())
//			return false;
//		
//		Person other = (Person) obj;
//		return active == other.active && Objects.equals(birthDate, other.birthDate)
//				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
//	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("EQUALS");
		return EqualsBuilder.reflectionEquals(this, obj);
	}
	
	@Override
	public int hashCode() {
		System.out.println("HASHCODE");
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public int compareTo(Person other) {
		return lastName.compareTo(other.lastName);
	}
}
