package de.cbw.oca.playground;

import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		// Erweiterbares "Array"
		ArrayList al = new ArrayList();
		al.add(1); // Nimmt Object entgegen int > Integer (boxing) > Object (widening)
		al.add("Hallo"); // String > Object (widening)
		al.add(10.5); // double > Double (boxing) > Object (widening)
		al.add(7);
		
		for(Object o : al) {
			System.out.println(o);
		}
		
		System.out.println();
		
		// ArrayList arbeitet intern mit einem Array
		// Array ist per default 10 Elemente groß 
		// Wenn es voll ist, wird es automatisch vergrößert (alte größe * 3 / 2)
		
		// <...> = GenericType (muss ein Objekttyp sein, darf nicht primitiv sein)
		ArrayList<Integer> al2 = new ArrayList<>();
		//ArrayList<Integer> al2 = new ArrayList<>(1000); // Internes Array ist 1000 Elemente groß (statt 10)
		al2.add(1); // Nimmt NUR Integer entgegen
		al2.add(2);
		al2.add(5);
		al2.add(7);
		
		for(Integer i : al2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// Einfügereihenfolge
		// Wahlfreier Zugriff
		System.out.println(al2.get(3)); // index startet bei 0
		System.out.println(al2.get(5)); // IndexOutOfBoundsException! index 5 ist nicht vorhanden
		
		al2.add(10); // nächste freie Position, ans Ende
		al2.add(1, 10); // An Position 1, alter werd auf 1 wird weitergeschoben
		
		al2.set(1, 100); // Ersetzt das Element auf dem index 1
		
		al2.remove(1); // Enternt Element an Position 1, folgewerte rücken auf
		//al2.remove(new Integer(5)); // Enternt das Element mit dem Wert 5
		al2.remove(Integer.valueOf(5)); // Enternt das Element mit dem Wert 5
		
		
	}
}
