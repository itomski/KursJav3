package de.cbw.oca.playground;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeTest {
	
	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		LocalDateTime dt = LocalDateTime.now();
		dt = LocalDateTime.of(d, t);
		System.out.println(dt);
		
		d = LocalDate.of(2022, 10, 17);
		System.out.println(d);
		d = LocalDate.of(2022, Month.OCTOBER, 17);
		System.out.println(d);
		
		System.out.println("---");
		Calendar c = new GregorianCalendar(2022, Calendar.OCTOBER, 17);
		Date date = c.getTime();
		System.out.println(date);
		System.out.println("---");
		
		
		t = LocalTime.of(17, 22);
		t = LocalTime.of(17, 22, 15);
		t = LocalTime.of(17, 22, 15, 500);
		System.out.println(t);
		
		dt = LocalDateTime.of(2022, 10, 17, 22, 15, 43);
		System.out.println(dt);
		machWas();
		
		
		try {
			machWasAnderes();
		} 
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("ENDE");
		}
		
	}
	
	public static void machWas() {
		// UncheckedException - Kann behandelt werden
		try {
			LocalDate d = LocalDate.of(2022, Month.FEBRUARY, 25);
		}
		catch (DateTimeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void machWasAnderes() throws FileNotFoundException {
		// CheckedException - Muss behandelt werden
		FileInputStream fis = new FileInputStream("data.txt");
	}
	

}
