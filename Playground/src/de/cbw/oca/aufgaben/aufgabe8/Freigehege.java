package de.cbw.oca.aufgaben.aufgabe8;

import java.util.ArrayList;
import java.util.List;

public class Freigehege {
	
	private List<Sozialisiert> tiere = new ArrayList<>();;

	public void aufnehmen(Sozialisiert s) {
		tiere.add(s);
		System.out.println(s.getClass().getSimpleName() + ": wurde ins Freie gelassen.");
	}

	public void starteFreiFuetterung() {
		
		System.out.println("Picknick im Freien");
		tiere.forEach(t -> t.frisst());
		
	}
}
