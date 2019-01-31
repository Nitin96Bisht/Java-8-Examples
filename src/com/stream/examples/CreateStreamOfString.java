package com.stream.examples;

import java.util.stream.Stream;

public class CreateStreamOfString {

	public static void main(String[] args) {
		System.out.println("Step 1. Creating stream of string.");
		
		System.out.println("Step 1.1. Creating stream of string using - of() method of stream and passing the string.");
		Stream<String> streamOfString = Stream.of("a", "b");
		
		System.out.println("Step 1.2. Creating stream of string using - of() method of stream and passing the string array.");
		Stream<String> streamOfString2 = Stream.of(new String[] {"a", "b"});
		
		System.out.println("Step 2. Displaying stream of string: ");
		streamOfString.forEach(System.out::println);
		
		System.out.println("Step 3. Displaying stream of string2: ");
		streamOfString2.forEach(System.out::println);
	}

}
