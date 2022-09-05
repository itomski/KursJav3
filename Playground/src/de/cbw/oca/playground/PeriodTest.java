package de.cbw.oca.playground;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodTest {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		LocalDate wm2022 = LocalDate.of(2024, 11, 20);
		
		Period p = Period.between(now, wm2022);
		System.out.println(p);
		
		
		LocalDateTime now2 = LocalDateTime.now();
		LocalDateTime wm2022b = LocalDateTime.of(2024, 11, 20, 17, 15);
		
		p = Period.between(now2.toLocalDate(), wm2022b.toLocalDate());
		System.out.println(p);
		
		Duration d = Duration.between(now2.toLocalTime(), wm2022b.toLocalTime());
		System.out.println(d);
		
		
		p = Period.of(15, 2, 13);
		System.out.println(p);
		p = Period.ofWeeks(10);
		System.out.println(p);
		
		p = Period.ofDays(70);
		System.out.println(p);
		System.out.println(p.normalized());
		
		d = Duration.ofSeconds(6000);
		System.out.println(d);

	}

}
