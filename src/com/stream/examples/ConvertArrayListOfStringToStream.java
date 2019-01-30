package com.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConvertArrayListOfStringToStream {

	public static void main(String[] args) {
		System.out.println("Step 1. Creating list of integer.");
		List<String> listOfIntegers = new ArrayList<>();
		listOfIntegers.add("a");
		listOfIntegers.add("b");
		
		System.out.println("Step 2. Converting list (ArrayList) of integer to stream.");
		Stream<String> streamOfInteger = listOfIntegers.stream();
		
		System.out.println("Step 3. Display stream of integer: ");
		streamOfInteger.forEach(System.out::println);
	}

}
