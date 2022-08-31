package de.cbw.oca.playground;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {

	public static void main(String[] args) {
		
		String[] namen = {"Peter", "Bruce", "Natasha", "Steve", "Tony", "Carol"};
		
		Arrays.sort(namen);
		
		for(String name : namen)
			System.out.println(name);
		
		System.out.println();
		
		int pos = Arrays.binarySearch(namen, "Hans"); // wenn nicht da ist der index im minus + 1
		System.out.println(pos);
		
		System.out.println();
		
		// Array in Liste umwandeln
		List<String> namenListe = Arrays.asList(namen);
		
		// Liste in Array
		namen = namenListe.toArray(new String[0]);
		Collections.sort(namenListe); // Sortiert nach natural order
		
		// ArrayList ist geordnet aber nicht sortiert
		// HashSet ist NICHT geordnet und NICHT sortiert
		// TreeSet ist IMMER sortiert
		
		System.out.println(namenListe);
		pos = Collections.binarySearch(namenListe, "Peter");
		System.out.println(pos);
	}
}
