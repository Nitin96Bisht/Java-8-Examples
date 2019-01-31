package com.stream.examples;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindMaximumOfAllNumbersInIntStream {

	public static void main(String[] args) {

		// Find maximum of all numbers in IntStream
		OptionalInt max = IntStream.of(9, 5, 3, 12, 4).max();
		System.out.println("Max: " + max.getAsInt());
	}

}
