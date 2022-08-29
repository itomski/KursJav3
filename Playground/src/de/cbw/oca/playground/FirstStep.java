package de.cbw.oca.playground;

import java.time.LocalDate;

public class FirstStep {

	public static void main(String[] args) {
		
		System.out.println("Start...");
		
		String text = "Das ist die Mitte...";
		
		machWas(text);
		
		Person p1 = new Person("Peter", "Parker", LocalDate.now(), true);
		System.out.println(p1.getFirstName());
		
		Object o1 = p1;
		
		
		System.out.println("Ende");

	}
	
	private static void machWas(String t) {
		System.out.println(t);
	}

}
