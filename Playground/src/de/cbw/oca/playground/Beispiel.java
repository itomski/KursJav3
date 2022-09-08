package de.cbw.oca.playground;

public class Beispiel {

	public static void main(String[] args) {
		
		AFirst af = new ANext();
		//AFirst af = new AFirst();
		
		af.doSomething();
		
	}
}

class AFirst {
	
	int i = 10;
	
	public AFirst() {
		machWas();
	}
	
	void doSomething() {
		System.out.println(i);
		machWas();
	}
	
	void machWas() {
		System.out.println("AFirst machWas: " + i);
	}
}

class ANext extends AFirst {
	
	int i = 20;
	
	public ANext() {
		// super();
	}
	
	void machWas() {
		System.out.println("ANext machWas: " + i);
	}
}


