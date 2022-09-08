package de.cbw.oca.playground;

public class KlausurVorbereitung1 {

	// Klassen und Instanzvariablen haben Default-Werte
	private static boolean v1;
	
	
	public static void main(String[] args) {
		
		// Lokalen Variablen haben KEINE Default-Werte
		boolean v2;
		System.out.println(v1);
		//System.out.println(v2); // Error
		
		int i1 = 10, i2 = 5, i3 = 22;
		int i4, i5;
		
		System.out.println("..." + i1 + i2); // ...105
		System.out.println("..." + i1 * i2); // ...50
		//System.out.println("..." + i1 - i2); // Error
		System.out.println(i1 + i2 + "..."); // 15...
		
		System.out.println();
		
		Integer in1 = 100;
		Integer in2 = 100;
		System.out.println(in1 == in2);
		
		// Ganzzahlenwerte zwischen -128 und 127 liegen im Byte-Literal-Pool 
		
		in1 = 150;
		in2 = 150;
		System.out.println(in1 == in2);
		
		Long l1 = 100l; 
		Long l2 = 100l; // long wird geboxt zu Long
		System.out.println(l1 == l2);
		
		byte b1 = 10;
		byte b2 = 20;
		//byte b3 = b1 + b2; // math.ops machen primitiv widening zu mind. int
		//b1 = b1 + b2;
		b1 += b2; // b1 = (byte)(b1 + b2)
		b1++; // b1 = (byte)(b1 + 1)
		
	}
}
