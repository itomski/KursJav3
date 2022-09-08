package de.cbw.oca.playground;

public class KlausurVorbereitung2 {

	private static int a = 100;
	private static int b = 200;
	
	
	public static void main(String[] args) {
		System.out.println(a + b); // 300
		System.out.println(a + add(10)); // 310
		
		
		int i = 10;
		i = ++i; // 10
		System.out.println(i++ + ++i + i++);
		
		
		
	}
	
	public static int add(int a) {
		return a + b;
	}
}
