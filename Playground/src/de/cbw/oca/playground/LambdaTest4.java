package de.cbw.oca.playground;

import java.util.Random;
import java.util.List;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest4 {

	public static void main(String[] args) {
		
		final String[] firstNameArr = {"Peter", "Bruce", "Natasha", "Carol", "Steve", "Tony"};
		final String[] lastNameArr = {"Parker", "Banner", "Romanov", "Danvers", "Rogers", "Stark"};
		final Random rand = new Random();
		
		// produziert primitive ints
		IntSupplier w6 = () -> rand.nextInt(6); 
		
		Supplier<Person> pSup = () -> new Person(firstNameArr[w6.getAsInt()], lastNameArr[w6.getAsInt()], null, true);
		
		//Stream.generate(pSup).limit(2000).forEach(p -> System.out.println(p.getFirstName() + " " + p.getLastName()));
		
		List<Person> personen = Stream.generate(pSup)
										.limit(1_000_000)
										.filter(p -> p.getLastName().equals("Banner")) // Predicate
										.collect(Collectors.toList());
		
		System.out.println(personen);
		

	}

}
