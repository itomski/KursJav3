package de.cbw.oca.playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] zahlen;
		//zahlen = {1,2,3,4,5,6,7,8}; // Error: nur bei deklaration möglich
		zahlen = new int[]{5,6,7};
		
		int[][] arr = new int[10][];
		arr[0] = new int[]{1,2,3};
		arr[1] = new int[]{1,2};
		arr[2] = new int[15];
		
		
		System.out.println();
		
		int[] zahlen2 = {17, 19, 2, -10, 8, -2};
		Arrays.sort(zahlen2); // -10, -2, 2, 8, 17, 19
		System.out.println(Arrays.binarySearch(zahlen2, 2)); // 2
		System.out.println(Arrays.binarySearch(zahlen2, 3)); // -4 (möglche Pos -1)
		System.out.println();
		
		// Generische Typen müssen komplex sein
		List<Integer> zahlen3 = new ArrayList<>(Arrays.asList(17, 19, 2, -10, 8, -2));
		Collections.sort(zahlen3);
		System.out.println(Collections.binarySearch(zahlen3, 2)); // 2
		System.out.println(Collections.binarySearch(zahlen3, 3)); // -4
		System.out.println();
		
		final int const1 = 10; // Kompiletimekonstante
		final int const2;
		const2 = 15; // Runtimekonstante
		
		System.out.println("Wert ist " + const1); // "Wert ist 10"
		System.out.println("Wert ist " + const2);
		
		int wert = 17;
		
		switch(wert) {
		
			case const1: // Nach dem Kompilieren steht hier eine 10
				//...
				break;
				
			case const1 + 2: // Nach dem Kompilieren steht hier eine 12
				//...
				break;	
				
			//case const2: // Error: Wert von const 2 steht erst zur Laufzeit fest
				//
				//break;
		}
		
		
		boolean v1 = true;
		
		final boolean v2 = true;
		
		final boolean v3;
		v3 = true;
		
		
		while(v3) {
		}
		
		System.out.println("Hi");
		

	}

}
