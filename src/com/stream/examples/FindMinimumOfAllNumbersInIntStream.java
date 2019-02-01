package com.stream.examples;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindMinimumOfAllNumbersInIntStream {

	public static void main(String[] args) {

		// Find minimum of all numbers in IntStream
		OptionalInt min = IntStream.of(9, 5, 3, 12, 4).min();
		System.out.println("Min: " + min.getAsInt());
	}

}
