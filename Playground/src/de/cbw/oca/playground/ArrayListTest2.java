package de.cbw.oca.playground;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		// Interfacetyp			 // Klassentyp
		// Referenztyp			 // Objekttyp
		// Typ der lokalen Referenz
								 // Typ des Objektes auf dem Heap
		List<String> namen = new ArrayList<>(); // rechts muss immer eine konkrete Klasse stehen
		
		Object o = new Thing("Hammer", 1.5);
		o.hashCode(); // über o nur Methoden von Object verfügbar
		Thing t = (Thing) o;
		t.getName(); // über t sind alle Methoden von Thing sichtbar
		
		namen.add("Bruce");
		namen.add("Carol");
		namen.add("Steve");
		
		namen = new LinkedList<>(namen); // Wechsel von ArrayList zu LinkedList
		
		namen = new ArrayList<>(namen); // Wechsel von LinkedList zu ArrayList
		
		System.out.println("--------------------");
		
		ArrayList<Thing> sachen = new ArrayList<>();
		sachen.add(new Thing("Hammer", 1.5));
		sachen.add(new Thing("Zange", 0.5));
		sachen.add(new Thing("Helm", 0.250));
		
		
		List<Thing> listClone = (List<Thing>) sachen.clone();
		
		listClone.get(0).setWeight(2.5); // clone und original teilen sich die Objekte auf dem Heap
		// Elemente der Liste sind nur Referenzen auf die echten Objekte auf dem Heap
		
		listClone.add(new Thing("Trinkflasche", 0.5));
		listClone.remove(0);
		
		System.out.println(sachen);
		System.out.println(listClone);
		
//		Object // ein Objekt
//		Objects // Utilty-Klasse für die Verarbeitung von Objekten
//		Arrays // Utilty-Klasse für die Verarbeitung von Arrays
//		Collections // Utilty-Klasse für die Verarbeitung von Collections
		
	}
}
