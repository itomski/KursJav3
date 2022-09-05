package de.cbw.oca.playground;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest2 {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		now = now.plus(10, ChronoUnit.DAYS);
		System.out.println(now);
		
		now = now.plusDays(10);
		System.out.println(now);
		
		now = now.plusYears(10);
		System.out.println(now);
		
		//now.plusDays(10).plusWeeks(15);
		
		System.out.println();
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		System.out.println(t.plus(100, ChronoUnit.MINUTES));
		
		if(t.isSupported(ChronoUnit.DAYS)) {
			System.out.println(t.plus(100, ChronoUnit.DAYS));
		}
		
		// Jahre, Monate, Wochen, Tage...
		Period p = Period.ofDays(25); // Ein Zeitabschnitt in Tagen 
		now = now.plus(p); // 25 Tage werden zu now hinzugefügt
		
		// Tage(24 Std), Stunden, Minuten, Sekunden, Millisekunden, Nanosekunden...
		Duration d = Duration.ofHours(15); // Ein Zeitabschnitt in Stunden
		//now = now.plus(d); // Exception: Zeitangaben für Datum sind nicht möglich
		t = t.plus(d);
		System.out.println(t);
	}

}
