package de.cbw.oca.playground;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KlausurVorbereitung4 {
	
	static int a = 0x10; // 16
	static int b = 100;
	static int c = a + b;
	
	static double d = 100.0; 
	static int e = 100; 
	
	public static void main(String[] args) {
		System.out.println(c);
		
		int f = (int)d + e;
		System.out.println(f);
		
		
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity()); // 16
		System.out.println(sb.length()); // 0
		sb.append("ABCDEF");
		sb.append("ABCDEF");
		sb.append("ABCDEF");
		System.out.println(sb.capacity()); // 34
		System.out.println(sb.length()); // 18
		sb.trimToSize();
		System.out.println(sb.capacity()); // 18
		sb.setLength(100);
		System.out.println(sb.capacity()); // 100
		
		
		System.out.println();
		
		LocalDate ld = LocalDate.of(2022, 11, 22);
		System.out.println(ld.format(DateTimeFormatter.ofPattern("d-M-yyyy")));
		
		DateTimeFormatter FMT = DateTimeFormatter.ofPattern("d-M-yyyy");
		
		LocalDate d1 = LocalDate.parse("10-7-2022", FMT);
		// LocalDate d2 = FMT.parse("10-7-2022"); // Error
		
		System.out.println(ld.format(FMT));
		System.out.println(FMT.format(ld));
		
		System.out.println();
		
		ld = LocalDate.of(2022, 8, 31);
		//ld = ld.plusMonths(1);
		ld = ld.minusMonths(6);
		System.out.println(ld);
		
	}

}
