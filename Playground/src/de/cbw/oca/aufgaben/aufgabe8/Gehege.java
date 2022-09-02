package de.cbw.oca.aufgaben.aufgabe8;

import java.util.ArrayList;
import java.util.List;

public class Gehege {
	
	private List<Sozialisiert> tiere = new ArrayList<>();;

	public void aufnehmen(Sozialisiert s) {
		tiere.add(s);
		System.out.println(s.getClass().getSimpleName() + ": wurde im Gehege aufgenommen.");
	}
	
	public void starteFuetterung() {
		// void accept(T t)
		tiere.forEach(t -> t.frisst());
	}
	
	public void starteNachtruhe() {
		tiere.forEach(t -> t.schlaeft());
	}
}
