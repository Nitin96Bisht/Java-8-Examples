package com.dates.examples;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class HowToUseDifferentTimeZoneInJava8 {

	public static void main(String[] args) {

		System.out.println("ZoneId of Asia/Kolkata");
		ZoneId zoneId1 = ZoneId.of("Asia/Kolkata");
		System.out.println("zoneId1: " + zoneId1);
		System.out.println("zoneId1.getId(): " + zoneId1.getId());
		System.out.println("zoneId1.getRules(): " + zoneId1.getRules());
		
		System.out.println("\nZoneId.of Europe/Paris");
		ZoneId zoneId2 = ZoneId.of("Europe/Paris");
		System.out.println("zoneId2: " + zoneId2);
		System.out.println("zoneId2.getId(): " + zoneId2.getId());
		System.out.println("zoneId2.getRules(): " + zoneId2.getRules());
		
		// ************************************************** - 2) How to use different timeZone in java8 - ZonedDateTime
		
		// Create ZonedDateTime by passing Asia/Kolkata in atZone method of LocalDateTime
		
		ZonedDateTime zonedDateTime = LocalDateTime.now().atZone(ZoneId.of("Asia/Kolkata"));
		
		// Display zonedDateTime
		System.out.println("\n\n\nZonedDateTime: " + zonedDateTime);
		
		// Now get ZoneOffSet
		ZoneOffset zoneOffSet = zonedDateTime.getOffset();
		
		// Now display zone offset
		System.out.println("zoneOffSet: " + zoneOffSet);
		System.out.println("zoneOffset.getId(): " + zoneOffSet.getId());
		
		// ************************************************** - 3) Display different timeZones in java8
		
		System.out.println("\n\n" + ZoneId.of("US/Samoa").getRules());
		System.out.println(ZoneId.of("CET").getRules());
		System.out.println(ZoneId.of("Europe/Paris").getRules());
		System.out.println(ZoneId.of("GMT").getRules());
		System.out.println(ZoneId.of("Asia/Kolkata").getRules());
		System.out.println(ZoneId.of("Australia/Melbourne").getRules());
	}

}
