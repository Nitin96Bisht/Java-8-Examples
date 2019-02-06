package com.dates.examples;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class FindDifferenceInHourMinuteAndSecondInTwoDifferentTimeZone {

	public static void main(String[] args) {

		LocalTime myLocalTime = LocalTime.now();
		LocalTime otherLocalTime = LocalTime.now(ZoneId.of("Europe/Paris"));
		
		// Display two different timeZone
		System.out.println("myLocalTime: " + myLocalTime);
		System.out.println("otherLocalTime: " + otherLocalTime);
		
		// Find which timeZone is before
		System.out.println("myLocalTime is before otherLocalTime: " + myLocalTime.isBefore(otherLocalTime));
		
		System.out.println("\nNow calculate difference between two different timeZone");
		
		// Find difference in HOURS in between timeZones
		long hoursDifference = ChronoUnit.HOURS.between(myLocalTime, otherLocalTime);
		System.out.println("hoursDifference: " + hoursDifference);
		
		// Find difference in MINUTES in between timeZones
		long minutesDifference = ChronoUnit.MINUTES.between(myLocalTime, otherLocalTime);
		System.out.println("minutesDifference: " + minutesDifference);
		
		// Find difference in SECONDS in between timeZones
		long secondsDifference = ChronoUnit.SECONDS.between(myLocalTime, otherLocalTime);
		System.out.println("secondsDifference: " + secondsDifference);
		
		// ************************************************** - 2) Find difference in hour minute and second in two different time zone
		
		//Find time difference in two different timeZone
        LocalTime localTime1 = LocalTime.now(ZoneId.of("Europe/Paris")); //LocalTime of Europe/Paris
        LocalTime localTime2 = LocalTime.now(ZoneId.of("Asia/Kolkata")); //LocalTime of Asia/Kolkata
        
        // Display two different timeZone
        System.out.println("localTime1: " + localTime1);
        System.out.println("localTime2: " + localTime2);
        
        // Find which timeZone is before
        System.out.println("localTime1 is before localTime2: " + localTime1.isBefore(localTime2));
        
        System.out.println("\nNow calculate difference between two different timeZone");
        
		// Find difference in HOURS in between timeZones
		long hoursDifference1 = ChronoUnit.HOURS.between(localTime1, localTime2);
		System.out.println("hoursDifference: " + hoursDifference1);
		
		// Find difference in MINUTES in between timeZones
		long minutesDifference1 = ChronoUnit.MINUTES.between(localTime1, localTime2);
		System.out.println("minutesDifference: " + minutesDifference1);

		// Find difference in SECONDS in between timeZones
		long secondsDifference1 = ChronoUnit.SECONDS.between(localTime1, localTime2);
		System.out.println("secondsDifference: " + secondsDifference1);
        
	}

}
