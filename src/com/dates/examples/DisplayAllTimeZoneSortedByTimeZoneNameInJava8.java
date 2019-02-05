package com.dates.examples;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DisplayAllTimeZoneSortedByTimeZoneNameInJava8 {

	public static void main(String[] args) {

		// Create TreeMap to put zone as key and zoneOffSet as value in zone
		TreeMap<String, String> allTimeZoneSortedByZoneMap = new TreeMap<>();
		
		// Get all available ZoneIds
		Set<String> differentTimeZonesIds = ZoneId.getAvailableZoneIds();
		
		for(String timeZoneId: differentTimeZonesIds) {
			// Create zonedDateTime by passing zone Asia/Kolkata in atZone method of LocalDateTime
			ZonedDateTime zonedDateTime = LocalDateTime.now().atZone(ZoneId.of(timeZoneId));
			
			// Get zoneOffSet
			ZoneOffset zoneOffSet = zonedDateTime.getOffset();
			
			// Put zone as key and zoneOffSet as value in TreeMap
			allTimeZoneSortedByZoneMap.put(ZoneId.of(timeZoneId).toString(), zoneOffSet.toString());
		}
		
		System.out.println("Display all TimeZone name (timeZone name or timeZone area) In Java");
		
		Iterator<Entry<String, String>> entryIterator = allTimeZoneSortedByZoneMap.entrySet().iterator();
		
		while(entryIterator.hasNext()) {
			System.out.println(entryIterator.next());
		}
	}

}
