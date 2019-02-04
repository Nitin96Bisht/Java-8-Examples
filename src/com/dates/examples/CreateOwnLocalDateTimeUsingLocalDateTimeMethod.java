package com.dates.examples;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class CreateOwnLocalDateTimeUsingLocalDateTimeMethod {

	public static void main(String[] args) {

		// Year, month, dayOfMonth, hour, minute, second
		LocalDateTime createOwnDateTime1 = LocalDateTime.of(2018, Month.OCTOBER, 22, 12, 9, 22);
		System.out.println("createOwnDateTime1: " + createOwnDateTime1);
		
		// Create own LocalDateTime from STRING using parse method
		String dateString = "2018-10-22T12:09:22";
		LocalDateTime createOwnDateTime2 = LocalDateTime.parse(dateString);
		System.out.println("createOwnDateTime2: " + createOwnDateTime2);
		
		// **************************************************************** 2) Create own LocalDateTime from STRING using parse method

		// Create own LocalDateTime from STRING
		// Define date in string
		String str1 = "2018-10-22 12:30:22";
		// Define formatter
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		// Now use parse method to formate date
		LocalDateTime localDateTime1 = LocalDateTime.parse(str1, dateTimeFormatter1);
		System.out.println("\n\nlocalDateTime1: " + localDateTime1);
		
		// To create formatted string from LocalDateTime object using format() method/
		// Define formatter
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime localDateTime2 = LocalDateTime.of(2018, 10, 22, 12, 36, 22);
		String formatLocalDateTimeInString = localDateTime2.format(dateTimeFormatter2);
		System.out.println("formatLocalDateTimeInString: " + formatLocalDateTimeInString);
	}

}
