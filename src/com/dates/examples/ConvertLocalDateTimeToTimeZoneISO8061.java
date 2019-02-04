package com.dates.examples;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ConvertLocalDateTimeToTimeZoneISO8061 {

	public static void main(String[] args) {

		System.out.println("Convert LocalDateTime to Time Zone ISO8061 String");
		LocalDateTime localDateTime = LocalDateTime.of(2018, Month.OCTOBER, 22, 1, 35, 21);
		
		// Use different zone
		ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneOffset.UTC);
		String str1 = zonedDateTime.toString();
		System.out.println("String with ISO8061: " + str1);
		
		// **************************************************************** 2) Convert ISO8061 String back to LocalDateTime in java
		
		System.out.println("Convert ISO8061 String back to a LocalDateTime");
		String str = "2018-10-22T01:35:21Z";
		ZonedDateTime zonedDateTime1 = ZonedDateTime.parse(str);
		LocalDateTime localDateTime2 = zonedDateTime1.toLocalDateTime();
		System.out.println("localDateTime: " + localDateTime2);
	}

}
