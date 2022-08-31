package de.cbw.oca.aufgaben.aufgabe3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntFunction;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Würfelbecher. Generiert Zufallszahlen zwischen 1 und 6.
 * @author tlubowiecki
 *
 */
public class DiceCup {
	
	private static final Random randGen;
	private static final int DICE_SIZE = 6;
	
	static {
		randGen = new Random();
	}
	
	private DiceCup() {
	}
	
	/**
	 * Generiert eine Zufallszahl zwischen 1 und 6
	 * @return Zahlen zwischen 1 und 6
	 */
	public static int roll() {
		return randGen.nextInt(DICE_SIZE) + 1;
	}
	
	/**
	 * Genereiert ein Array mit Zufallszahlen zwischen 1 und 6
	 * @param diceCount Anzahl der Würfel-Würfe
	 * @return Array mit Zahlen zwischen 1 und 6
	 */
	public static int[] roll(int diceCount) {
		
		//int[] diceArr = new int[diceCount];
		List<Integer> diceList = new ArrayList<>();
		
		for(int i = 0; i < diceCount; i++) {
			//diceArr[i] = roll();
			diceList.add(roll());
		}
		
		//return diceArr;
		//return diceList.toArray(new Integer[0]);
		//return diceList.stream().mapToInt(i -> i).toArray();
		return ArrayUtils.toPrimitive(diceList.toArray(new Integer[0]));
	}
	
	public static String summary(int[] diceArray) {
		
		StringBuilder sb = new StringBuilder();
		
		int[] values = count(diceArray); 
		
		for(int i = 0; i < values.length; i++) {
			sb.append(i + 1)
				.append(" : ")
				.append(values[i])
				.append(" mal \n");
		}
		
		return sb.toString();
	}
	
	private static int[] count(int[] diceArray) {
		
		int[] counts = new int[DICE_SIZE];
		
		for(int dice : diceArray) {
			counts[dice - 1]++;
		}
		return counts;
	}
}
