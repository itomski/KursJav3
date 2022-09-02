package de.cbw.oca.playground;

import java.util.Random;

public class NextDiceCup {
	
	private NextDiceCup() {
	}
	
	private static final Random rand = new Random();
	
	public static int roll() {
		return rand.nextInt(6);
	}
	
	public static int[] roll(int count) {
		
		int[] diceValues = new int[count];
		
		for(int i = 0; i < diceValues.length; i++)
			diceValues[i] = roll();
		
		return diceValues;
	}
}
