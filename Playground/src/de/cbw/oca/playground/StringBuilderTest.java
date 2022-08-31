package de.cbw.oca.playground;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String s = "Das";
		s += " ist";
		s += " das";
		s += " Haus";
		s += " von";
		s += " Nikigraus";
		
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder(); // default capacity von 16
		System.out.println("Default Capacity: " + sb.capacity());
		sb.append("Das");
		sb.append(" ist");
		sb.append(" das");
		sb.append(" Haus");
		sb.append(" von"); // Byte-Array im StringBuilder muss vergrößert werden (alte größe * 2 + 2)
		sb.append(" Nikigraus");
		System.out.println("Capacity: " + sb.capacity());
		
		sb.trimToSize(); // Überflüssige Capacity wird abgeschnitten
		System.out.println("TrimToSize: " + sb.capacity());
		
		System.out.println(sb); // toString von sb wird automatisch verwendet
		
		System.out.println();
		sb = new StringBuilder(100); // Capacity = 100
		System.out.println(sb.capacity());
		
		System.out.println();
		sb = new StringBuilder("Das ist... "); // Capacity = 16 + Länge von Starttext = 27
		System.out.println(sb.capacity());
		
		
		sb.insert(0, ">>>>"); // Fügt Zeichen an vorgegebener Stelle ein
		
		sb.replace(0, 10, "LEER..."); // ersetzt Zeichen
		
		
		CharSequence cs1 = "Das ist ein Haus...";
		
		// StringBuffer
		CharSequence cs2 = new StringBuilder("Hallo Welt");
		
		
		// String < CharSequence < Object
		
		// IS-A
		// JuraStudent < Student < Mensch < Lebewesen
//		Student s = new Student();
//		if(s instanceof Lebewesen) {
//			//...
//		}
	}
}
