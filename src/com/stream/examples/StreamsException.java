package com.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsException {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("a");
		
		Stream<String> stream = stringList.stream();
		
		stream.forEach(System.out::println);
		
		// Uncomment this line to avoid an exception because stream has already been operated upon or closed
		// stream = stringList.stream(); 
		stream.forEach(System.out::println);
	}

}
