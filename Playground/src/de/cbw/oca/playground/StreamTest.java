package de.cbw.oca.playground;

import java.util.Random;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		Stream.generate(() -> rand.nextInt(10) + 1)
			.parallel()
			.limit(10_000_000)
			.filter(w -> w > 5)
			.forEach(System.out::println);
	}

}
