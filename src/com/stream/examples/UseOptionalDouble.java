package com.stream.examples;

import java.util.OptionalDouble;

public class UseOptionalDouble {

	public static void main(String[] args) {

		OptionalDouble optionalDouble = OptionalDouble.of(5.0);
		
		System.out.println("optionalDouble.isPresent(): " + optionalDouble.isPresent());
		
		// get() returns the value
		System.out.println("optionalDouble.get(): " + optionalDouble.getAsDouble());
		
		// orElse method - Return the value if present, otherwise return other
		System.out.println("optionalDouble.orElse: " + optionalDouble.orElse(6.0));
		
		System.out.println("\n1. optionalDouble.ifPresent");
		//ifPresent method - If a value is present, it invokes the specified consumer with the value, otherwise do nothing
		optionalDouble.ifPresent(System.out::println);
		
		System.out.println("\n2. optionalDouble.ifPresent");
		// Display some custom message if value is present
		optionalDouble.ifPresent(d-> System.out.println("Value: " + d));
	}

}
