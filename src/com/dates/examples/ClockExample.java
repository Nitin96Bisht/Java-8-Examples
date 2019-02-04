package com.dates.examples;

import java.time.Clock;
import java.time.Instant;

public class ClockExample {

	public static void main(String[] args) {
		// clock provides date and time using a current time-zone
		
		Clock clock = Clock.systemDefaultZone();
		System.out.println("Clock: " + clock);
		System.out.println("Current millisecond instant of the clock: " + clock.millis());
		
		// Instant class is for - instantaneous point on the time-line
		Instant instant = clock.instant();
		System.out.println("Instant: " + instant);
	}

}
