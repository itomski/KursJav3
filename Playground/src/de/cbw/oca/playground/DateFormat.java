package de.cbw.oca.playground;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormat {

	public static void main(String[] args) {
		
		Locale loc = Locale.getDefault();
		System.out.println(loc);
		
		//Locale.setDefault(Locale.JAPAN);
		DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
		LocalDate now = LocalDate.now();
		System.out.println(now.format(fmt));
		System.out.println(fmt.format(now));
		
		fmt = DateTimeFormatter.ofPattern("dd. MMMM uuuu"); // "dd. MMMM uuuu HH:mm:ss"
		System.out.println(now.format(fmt));
		
		//LocalDate d2 = LocalDate.parse("15.02.1995");
		LocalDate d2 = LocalDate.parse("1995-02-15");
		System.out.println(d2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
		
		fmt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		d2 = LocalDate.parse("15.02.1995", fmt);
		System.out.println(d2);
		
		fmt = DateTimeFormatter.ofPattern("yyyy-M-d");
		d2 = LocalDate.parse("1995-2-15", fmt);
		System.out.println(d2); // 1995-02-15
		
		System.out.println(LocalDate.now().format(CustomFormats.DATE_SHORT));
		System.out.println(LocalTime.now().format(CustomFormats.TIME_SHORT));
		
		//now.isAfter(d2)
		//now.isBefore(d2)
	}

}
