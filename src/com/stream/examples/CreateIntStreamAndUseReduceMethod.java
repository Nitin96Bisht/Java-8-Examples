package com.stream.examples;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class CreateIntStreamAndUseReduceMethod {

	public static void main(String[] args) {

		System.out.println("Create IntStream:");
		IntStream streamOfIntegers = IntStream.of(1, 2, 3, 4);
		
		System.out.println("Use reduce() method - to calculate sum of int in IntStream");
		
		// reduce() method will reduce stream to calculate sum of Integers in IntStream
		OptionalInt optionalInt = streamOfIntegers.reduce((i1, i2) -> i1 + i2);
		
		//Display optionalInt
		System.out.println("Sum = " + optionalInt.getAsInt());
	}

}
