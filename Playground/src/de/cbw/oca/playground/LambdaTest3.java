package de.cbw.oca.playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaTest3 {

	public static void main(String[] args) {
		
		// Arrays.asList produziert eine fixed-size-liste
		List<String> namen = new ArrayList<>(Arrays.asList("Peter", "Carol", "Tony", "Natasha"));
		//namen = Arrays.asList(new String[]{"A", "B", "C"});
		
		// Ab Java 1.9
		//List<String> namen2 = List.of("A", "B", "C");
		
		namen.forEach(name -> System.out.println(name));
		
		// void	accept(T t)
		Consumer<String> cons = name -> System.out.println(name);
		namen.forEach(cons);
		
		// OCA: Eigene FunctionalInterfaces, Predicate
		
		Predicate<String> pred1 = name -> name.startsWith("T");
		Predicate<String> pred2 = name -> name.endsWith("a");
		//namen.removeIf(pred1.and(pred2));
		//namen.removeIf(pred1.or(pred2));
		namen.removeIf(pred1.or(pred2).negate());
		System.out.println(namen);
		
		Predicate<String> eq = Predicate.isEqual("Peter");
		System.out.println(eq.test("Peter"));
	}

}
