package com.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ShortCircuitingOperationsInStream {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		
		stringList.add("a");
		stringList.add("b");
		stringList.add("a");
		
		// display distinct records in stream
		Stream<String> stream = stringList.stream();
		
		stream.distinct().forEach(System.out::println);
		
		// SHORT CIRCUITING OPERATIONS
		System.out.println("1. Short-circuiting stateful intermediate operations");
		
		// findFirst() method - return first element in the stream
		System.out.println("findFirst() method: ");
		stream = stringList.stream();
		Optional<String> optional1 = stream.findFirst();
		System.out.println(optional1.get());
		
		// findAny() method - return any element in the stream
		System.out.println("findAny() method: ");
		stream = stringList.stream();
		Optional<String> optional2 = stream.findAny();
		System.out.println(optional2.get());
		
		// In one line find any record start with 'a' in the stream
		stream = stringList.stream();
		boolean anyRecordStartsWithA = stream.anyMatch(s-> s.startsWith("a"));
		System.out.println("\n2.any Record Starts With 'a'  = "+anyRecordStartsWithA);
		
		// In one line find whether all record start with 'a' in the stream
		stream = stringList.stream();
		boolean allRecordStartsWithA = stream.allMatch(s-> s.startsWith("a"));
		System.out.println("\n3.all Record Starts With 'a'  = " + allRecordStartsWithA);
		
		// In one line find whether none of the record start with 'b' in the stream
		stream = stringList.stream();
		boolean noneRecordStartsWithB  = stream.noneMatch(s-> s.startsWith("b"));
		System.out.println("\n4.none Record Starts With 'b'  = " + noneRecordStartsWithB );
		
		// In one line count record start with 'a' in the stream
		stream = stringList.stream();
		long countOfRecordsStartsWithA  = stream.filter(s-> s.startsWith("a")).count();
		System.out.println("\n5.count Record Starts With 'a'  = " + countOfRecordsStartsWithA );		
	}

}
