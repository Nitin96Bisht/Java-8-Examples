package com.stream.examples;

import java.util.Optional;

public class UseOptionalInJava {

	public static void main(String[] args) {

		Optional<String> optional = Optional.of("hello");
		
		//isPresent() will return true - If a value is present
		System.out.println("optional.isPresent(): " + optional.isPresent());
		
		// get() returns a value
		System.out.println("optional.get(): " + optional.get());
		
		// orElse method - Return the value if present, otherwise return other
		System.out.println("optional.orElse: " + optional.orElse("alternateValue"));
		
		
		System.out.println("\n1. optional.ifPresent");
		//ifPresent method - If a value is present, it invokes the specified consumer with the value, otherwise do nothing
		optional.ifPresent(System.out::println);
		
		System.out.println("\n2 - optional.ifPresent");
        // Display some custom message if value is present
        optional.ifPresent((i) -> System.out.println("value = " + i)); 
	}

}
