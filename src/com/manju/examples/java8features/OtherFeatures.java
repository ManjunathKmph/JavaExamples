package com.manju.examples.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author manju
 *
 */
public class OtherFeatures {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("XYS", "AB", "c", "ef", "aERd","", "qwe", "");
		
		//Using stream and filter api's. Filters empty string and count it.
		long count = strings.stream().filter(s -> s.isEmpty()).count();
		System.out.println(count);
		
		//Using stream, filter and collect api's. Will all non empty strings.
		strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList()).forEach(System.out::println);
		
		//Using parallel stream and filter api's. Filters empty string and count it.
		long count1 = strings.parallelStream().filter(s -> s.isEmpty()).count();
		System.out.println(count1);
		
		//Using parallel stream, filter and collect joining api's. Will all non empty strings.
		String mergedStrings = strings.parallelStream().filter(s -> !s.isEmpty()).collect(Collectors.joining(","));
		System.out.println(mergedStrings);
		
		//Using comparator to compare the two strings and sort it.
		Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));
		System.out.println(strings);
		
		//Using Optional Api
		Integer i = null;
		Integer j = new Integer(10);
		System.out.println(Optional.ofNullable(i).isPresent());
		System.out.println(Optional.ofNullable(i).orElse(2));
		System.out.println(Optional.ofNullable(j).isPresent());
		System.out.println(Optional.ofNullable(j).orElse(2));
		
		//Using functional interface thread method invocation
		new Thread(() -> {
			int k=0;
			while(k < 5) {
				System.out.println("Running Thread name : " + Thread.currentThread().getName());
				k++;
			}
		}).start();
	}

}
