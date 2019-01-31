package com.stream.examples;

import java.util.stream.IntStream;

public class FindAllEvenNumbersGreaterThan2 {

	public static void main(String[] args) {

		// Find all even numbers greater than 2
		IntStream.of(1, 2, 3, 4, 5).filter(n-> n > 2).filter(n-> n % 2 == 0).forEach(System.out::println);
	}

}
