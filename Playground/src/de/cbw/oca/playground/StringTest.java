package de.cbw.oca.playground;

public class StringTest {

	public static void main(String[] args) {
		
		
		String s1 = "Moin"; // Landet im StringLiteralPool
		String s2 = "Moin"; // Wenn im Pool vorhanden, wird es referenziert und nicht neu erzeugt
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		System.out.println("---------");
		
		s2 = new String("Moin"); // Landet NICHT im Pool
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		System.out.println("---------");
		
		s1 = "Hallo Welt";
		s2 = "Hallo".concat(" Welt"); // Landet nicht im Pool
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		System.out.println("---------");
		
		final String s3 = "Hallo";
		final String s4 = "Welt...";
		
		String s5 = s3 + " " + s4; // Landet im Pool, wird zur kompilezeit zusammengesetzt 
		String s6 = "Hallo Welt...";
		
		System.out.println(s5.equals(s6));
		System.out.println(s5 == s6);
		
		System.out.println("---------");
		
		String s7 = "Hallo";
		String s8 = "Welt....";
		
		String s9 = s7 + " " + s8; // Landet im Pool, wird zur Laufzeit zusammengesetzt
		String s10 = "Hallo Welt....";
		
		System.out.println(s5.equals(s6));
		System.out.println(s5 == s6);
		
		System.out.println("---------");
		
		final boolean a = true; // Compiletime Konstante
		
		final boolean b; // Runtime Konstante
		b = true;
		
		while(b) {
			//...
		}
		
		System.out.println("Hallo"); // Error: Zeile nicht erreichbar

	}

}
