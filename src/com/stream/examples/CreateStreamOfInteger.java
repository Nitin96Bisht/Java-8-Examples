package com.stream.examples;

import java.util.stream.Stream;

public class CreateStreamOfInteger {

	public static void main(String[] args) {
		System.out.println("Step 1. Creating stream of integer.");
		
		System.out.println("Step 1.1. Creating stream of integer using - of() method of stream and passing the integer.");
		Stream<Integer> streamOfInteger = Stream.of(11, 12, 13);
		
		System.out.println("Step 1.2. Creating stream of integer using - of() method of stream and passing the integer array.");
		Stream<Integer> streamOfInteger2 = Stream.of(new Integer[] {11, 12, 13});
		
		System.out.println("Step 2. Displaying stream of integer: ");
		streamOfInteger.forEach(System.out::println);
		
		System.out.println("Step 3. Displaying stream of integer2: ");
		streamOfInteger2.forEach(System.out::println);
	}

}
