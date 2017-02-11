package com.manju.examples.java8features;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * @author manju
 *
 */
public class SummaryStatistics {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 9, 3, 7, 3, 5, 2, 10);
		
		IntSummaryStatistics statistics = numbers.stream().mapToInt(x -> x).summaryStatistics();
		
		//Print highest number in the list
		System.out.println(statistics.getMax());
		//print the lowest number in the list
		System.out.println(statistics.getMin());
		//print the average value
		System.out.println(statistics.getAverage());
		//print the sum value
		System.out.println(statistics.getSum());
		//print the number of elements in the list
		System.out.println(statistics.getCount());
		
		//print distinct numbers
		numbers.stream().distinct().forEach(System.out::println);
	}

}
