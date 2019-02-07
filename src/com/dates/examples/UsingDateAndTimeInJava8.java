package com.dates.examples;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class UsingDateAndTimeInJava8 {

	public static void main(String[] args) {

		// Get current LocalDateTime
		LocalDateTime localDateTimeToday = LocalDateTime.now();
		
		// Display LocalDate
		System.out.println("localDateTimeToday: " + localDateTimeToday);
		
		System.out.println("DayOfMonth: " + localDateTimeToday.getDayOfMonth());
		System.out.println("DayOfMonth: " + localDateTimeToday.getLong(ChronoField.DAY_OF_MONTH));
		
		System.out.println("Month: " + localDateTimeToday.getMonth());
		System.out.println("Month: " + localDateTimeToday.getLong(ChronoField.MONTH_OF_YEAR));
		
		System.out.println("Year: " + localDateTimeToday.getYear());
		System.out.println("Year: " + localDateTimeToday.getLong(ChronoField.YEAR));
		
		System.out.println("Hour: " + localDateTimeToday.getHour());
		System.out.println("Hour: " + localDateTimeToday.getLong(ChronoField.HOUR_OF_DAY));
		
		System.out.println("Minute: " + localDateTimeToday.getMinute());
		System.out.println("Minute: " + localDateTimeToday.getLong(ChronoField.MINUTE_OF_HOUR));
		
		System.out.println("Second: " + localDateTimeToday.getSecond());
		System.out.println("Second: " + localDateTimeToday.getLong(ChronoField.SECOND_OF_MINUTE));
		
		System.out.println("milliSecond: " + localDateTimeToday.getLong(ChronoField.MILLI_OF_SECOND));
		
		System.out.println("MINUTE_OF_DAY: " + localDateTimeToday.getLong(ChronoField.MINUTE_OF_DAY));
		
		System.out.println("SECOND_OF_DAY: " + localDateTimeToday.getLong(ChronoField.SECOND_OF_DAY));
		
		System.out.println("DAY_OF_WEEK: " + localDateTimeToday.getLong(ChronoField.DAY_OF_WEEK));
		
		System.out.println("DAY_OF_YEAR: " + localDateTimeToday.getLong(ChronoField.DAY_OF_YEAR));
		
		// **************************************************************** 2) Display next dates in java 8 - LocalDateTime
		
		System.out.println("\n\nDisplay next dates");
		
		LocalDateTime dateTomorrow = localDateTimeToday.plusDays(1);
		System.out.println("dateTomorrow: " + dateTomorrow);
		
		LocalDateTime nextWeek = localDateTimeToday.plusWeeks(1);
		System.out.println("nextWeek: " + nextWeek);
		
		LocalDateTime nextMonth = localDateTimeToday.plusMonths(1);
		System.out.println("nextMonth: " + nextMonth);
		
		LocalDateTime nextYear = localDateTimeToday.plusYears(1);
		System.out.println("nextYear = " + nextYear);

		LocalDateTime nextHour = localDateTimeToday.plusHours(1);
		System.out.println("nextHour = " + nextHour);

		LocalDateTime nextMinute = localDateTimeToday.plusMinutes(1);
		System.out.println("nextMinute = " + nextMinute);

		LocalDateTime nextSecond = localDateTimeToday.plusSeconds(1);
		System.out.println("nextSecond = " + nextSecond);
		
		// **************************************************************** 3) Display previous dates in java 8 - LocalDateTime
		
		System.out.println("\n\nDisplay previous dates");
		
		LocalDateTime dateYesterday = localDateTimeToday.minusDays(1);
		System.out.println("dateYesterday: " + dateYesterday);
		
		System.out.println("lastWeek: " + localDateTimeToday.minusWeeks(1));
		System.out.println("lastMonth: " + localDateTimeToday.minusMonths(1));
		System.out.println("lastYear: " + localDateTimeToday.minusYears(1));
		
	}

}
