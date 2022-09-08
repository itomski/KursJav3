package de.cbw.oca.playground;

public class KlausurVorbereitung3 {
	
	public static void main(String[] args) {
		
		First f1 = new Next();
		System.out.println();
		
		f1.machWas(); // instanzmethoden auf dem Objekttyp = Next
		f1.machWasAnderes(); // Klassenmethoden auf dem Referenztyp = First
		
		System.out.println(f1.a); // Variablen auf dem Refernztyp = First 
	}
}

class First {
	
	public String a = "Moin First";
	
	public First() {
		System.out.println(a);
	}
	
	public void machWas() {
		System.out.println("First machWas - " + a);
	}
	
	public static void machWasAnderes() {
		System.out.println("First machWasAnderes");
	}
	
	private void machWasGanzAnderes() {
		System.out.println("First machWasGanzAnderes");
	}
	
}

class Next extends First {
	
	public String a = "Moin Next";
	
	public Next() {
		//super();
		System.out.println(a);
	}
	
	public void machWas() {
		System.out.println("Next machWas - " + a);
	}
	
	public static void machWasAnderes() {
		System.out.println("Next machWasAnderes");
	}
	
	// Ist kein Überschreiben, da die Methode in First nicht vererbt wird - ist privat
	public int machWasGanzAnderes() {
		System.out.println("Next machWasGanzAnderes");
		return 1;
	}
}
