package com.dates.examples;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class UsingDateInJava8LocalDateExample {

	public static void main(String[] args) {

		// Get current LocalDate
		LocalDate localDateToday = LocalDate.now();
		
		// Display LocalDate
		System.out.println("LocalDateToday: " + localDateToday);
		System.out.println("DayOfMonth: " + localDateToday.getDayOfMonth());
		System.out.println("Month: " + localDateToday.getMonth());
		System.out.println("Year: " + localDateToday.getYear());
		
		System.out.println("Era: " + localDateToday.getEra());
		System.out.println("DayOfWeek: " + localDateToday.getDayOfWeek());
		System.out.println("DayOfYear: " + localDateToday.getDayOfYear());
		
		// **************************************************************** 2) Display next dates in java 8
		System.out.println("\n\nDisplay next dates");
		
		LocalDate dateTomorrow = localDateToday.plusDays(1);
		System.out.println("dateTomorrow: " + dateTomorrow);
		
		System.out.println("nextWeek: " + localDateToday.plusWeeks(1));
		System.out.println("nextMonth: " + localDateToday.plusMonths(1));
		System.out.println("nextYear: " + localDateToday.plusYears(1));
		
		System.out.println("\nDisplay next dates using java.time.temporal.ChronoUnit");
		
		System.out.println("nextDay: " + localDateToday.plus(1, ChronoUnit.DAYS));
		System.out.println("nextWeek: " + localDateToday.plus(1, ChronoUnit.WEEKS));
		System.out.println("nextYear: " + localDateToday.plus(1, ChronoUnit.YEARS));
		System.out.println("nextCentury: " + localDateToday.plus(1, ChronoUnit.CENTURIES));
		
		// **************************************************************** 3) Display previous dates in java 8
		System.out.println("\n\nDisplay previous dates");
		
		LocalDate dateYesterday = localDateToday.minusDays(1);
		System.out.println("dateYesterday: " + dateYesterday);
		
		System.out.println("lastWeek: " + localDateToday.minusWeeks(1));
		System.out.println("lastMonth: " + localDateToday.minusMonths(1));
		System.out.println("lastYear: " + localDateToday.minusYears(1));
		
		System.out.println("\nDisplay previous/last dates using java.time.temporal.ChronoUnit");
		
		System.out.println("lastDay: " + localDateToday.plus(-1, ChronoUnit.DAYS));
		System.out.println("lastWeek: " + localDateToday.plus(-1, ChronoUnit.WEEKS));
		System.out.println("lastYear: " + localDateToday.plus(-1, ChronoUnit.YEARS));
	}

}
