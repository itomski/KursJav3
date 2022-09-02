package de.cbw.oca.aufgaben.aufgabe8;

public class GehegeTest {

	public static void main(String[] args) {
		
		//Gehege gehege = new Gehege();
		Freigehege gehege = new Freigehege();
		
		Wolf w1 = new Wolf();
		gehege.aufnehmen(w1);
		
		Wolf w2 = new Wolf();
		gehege.aufnehmen(w2);
		
		Kudu k1 = new Kudu();
		gehege.aufnehmen(k1);
		
		Affe a1 = new Affe();
		gehege.aufnehmen(a1);
		
		Zecke z1 = new Zecke();
		gehege.aufnehmen(z1);
		
		
		System.out.println();
		
		//gehege.starteFuetterung();
		gehege.starteFreiFuetterung();
		
		System.out.println();
		
		gehege.aufnehmen(new Kudu());
		gehege.aufnehmen(new Kudu());
		//gehege.starteNachtruhe();

	}

}
