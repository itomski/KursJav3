package de.cbw.oca.aufgaben.aufgabe3;

import java.util.stream.Stream;

public class DiceCupTest {

	public static void main(String[] args) {
		
		System.out.println(DiceCup.roll());
		System.out.println(DiceCup.roll());
		System.out.println(DiceCup.roll());
		System.out.println(DiceCup.roll());
		System.out.println(DiceCup.roll());
		System.out.println(DiceCup.roll());
		System.out.println(DiceCup.roll());
		
		System.out.println();
		
		for(int value : DiceCup.roll(10)) {
			System.out.println(value);
		}
		
		System.out.println();
		
		System.out.println(DiceCup.summary(DiceCup.roll(100)));
		
		System.out.println();
		
//		Stream randGen = Stream.generate(() -> DiceCup.roll());
//		randGen.forEach(d -> System.out.println(d));
		
		Stream.generate(() -> DiceCup.roll())
				.forEach(d -> System.out.println(d));

	}

}
