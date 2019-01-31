package com.stream.examples;

import java.util.stream.IntStream;

public class FindAllOddNumberBetween1To5 {

	public static void main(String[] args) {

		// Find all odd numbers between 1 to 5
		IntStream.of(1, 2, 3, 4, 5).filter(n-> n % 2 == 1).forEach(System.out::println);
	}

}
