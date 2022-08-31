package de.cbw.oca.playground;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VergleichsTest {
	
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Anna", "Parker", LocalDate.now(), true);
		Person p3 = new Person("Carol", "Danvers", LocalDate.now(), true);
		Person p2 = new Person("Bruce", "Banner", LocalDate.now(), true);
		
		List<Person> personen = new ArrayList<>();
		personen.add(p1);
		personen.add(p2);
		personen.add(p3);
		
		//Collections.sort(personen); // verwendet compateTo von Person
		
		// Verwendet zum Sortieren einen Comparator
		Collections.sort(personen, (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
		
		personen.forEach(p -> System.out.println(p.getFirstName() + " " + p.getLastName()));
		
	}
	
	
	
	

}
