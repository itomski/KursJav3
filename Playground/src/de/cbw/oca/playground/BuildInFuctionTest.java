package de.cbw.oca.playground;

import java.time.LocalDate;
import java.util.function.Function;

public class BuildInFuctionTest {

	public static void main(String[] args) {
		
		// Function: T = Eingangstyp, R = Rückgabetyp
		Function<String, Integer> fn1 = (s) -> Integer.parseInt(s);
		
		int zahl = fn1.apply("17");
		System.out.println(zahl);
		
		
		Function<Person, String> fn2 = (p) -> p.getFirstName() + " " + p.getLastName();
		
		Person pers1 = new Person("Peter", "Parker", LocalDate.now(), false);
		System.out.println(fn2.apply(pers1));
		
	}
	
}
