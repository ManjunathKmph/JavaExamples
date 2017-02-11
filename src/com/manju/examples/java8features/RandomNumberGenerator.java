package com.manju.examples.java8features;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author manju
 *
 */
public class RandomNumberGenerator {
	
	public static void main(String[] args) {
		
		//Generating Randome numbers using java 8 api's.
		
		Random random = new Random();
		IntStream intStream = random.ints().limit(10);
		
		//sorting and iterating all the elements
		intStream.sorted().forEach(System.out::println);
	}

}
