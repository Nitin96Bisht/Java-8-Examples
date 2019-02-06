package com.dates.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ISODateTimeFormatteddateAndTime {

	public static void main(String[] args) {

		// Display ISO_DATE - formatted date
		DateTimeFormatter ISO_DATE_formatter = DateTimeFormatter.ISO_DATE;
		System.out.println("ISO_DATE: " + ISO_DATE_formatter.format(LocalDate.now()));
		
		// Display ISO_DATE_TIME - formatted date and time
		DateTimeFormatter ISO_DATE_TIME_formatter = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("ISO_DATE_TIME: " + ISO_DATE_TIME_formatter.format(LocalDateTime.now()));
	}

}
