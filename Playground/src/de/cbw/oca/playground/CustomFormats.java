package de.cbw.oca.playground;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public interface CustomFormats {
	
	// public static final 
	DateTimeFormatter DATE_SHORT = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
	DateTimeFormatter TIME_SHORT = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

}
