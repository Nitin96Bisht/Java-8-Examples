package com.stream.examples;

import java.util.stream.IntStream;

public class CountNumberOfRecordsGreaterThan2 {

	public static void main(String[] args) {

		// Count number of records greater than 2
		long countRecordsGreaterThan2 = IntStream.of(1, 2, 3, 4, 5).filter(n-> n > 2).count();
		System.out.println("Count number of records greater than 2: " + countRecordsGreaterThan2);
	}

}
