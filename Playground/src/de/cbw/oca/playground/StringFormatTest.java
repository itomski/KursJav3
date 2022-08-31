package de.cbw.oca.playground;

public class StringFormatTest {

	private static final String FMT = "%-10s | %-10s | %5d %n";
	
	public static void main(String[] args) {
		
		// printf = sofortige Ausgabe auf der Konsole
		System.out.printf(FMT, "Peter", "Parker", 15);
		System.out.printf(FMT, "Natasha", "Romanov", 172);
		System.out.printf(FMT, "Bob", "Nux", 2);
		
		// formatierter String wird in einer Variable abgelegt
		String fLine = String.format(FMT, "Max", "Mustermann", 28);

	}

}
