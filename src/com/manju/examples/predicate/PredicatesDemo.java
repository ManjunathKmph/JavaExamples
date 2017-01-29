package com.manju.examples.predicate;

import java.util.Arrays;
import java.util.List;

public class PredicatesDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
		List<String> stringNumbers = Arrays.asList(new String("One"), new String("Two"), new String("Three"));
		PredicateDemo pDemo = new PredicateDemo();
		System.out.println("Print all the numbers : " + pDemo.testPredicate01(x -> true, numbers));
		System.out.println("Print all the even numbers : " + pDemo.testPredicate01(x -> (x & 1) == 0, numbers));
		System.out.println("Print all the odd numbers : " + pDemo.testPredicate01(x -> (x & 1) == 1, numbers));
		
		System.out.println("Print all the numbers : " + pDemo.testPredicate01(x -> true, stringNumbers));
		System.out.println("Print all the even numbers : " + pDemo.testPredicate01(x -> x.contains("e"), stringNumbers));
		System.out.println("Print all the odd numbers : " + pDemo.testPredicate01(x -> x.contains("T"), stringNumbers));
		
		System.out.println("Print all the numbers : -->Negate: " + pDemo.testPredicateNegate(x -> true, numbers));
		System.out.println("Print all the even numbers : -->Negate: " + pDemo.testPredicateNegate(x -> (x & 1) == 0, numbers));
		System.out.println("Print all the odd numbers : -->Negate : " + pDemo.testPredicateNegate(x -> (x & 1) == 1, numbers));
		
		System.out.println("Print even or odd numbers : " + pDemo.testPredicateOr(x -> (x & 1) == 0, x -> (x & 1) == 1, numbers));
		System.out.println("Print even and odd numbers : " + pDemo.testPredicateAnd(x -> (x & 1) == 0, x -> (x & 1) == 1, numbers));
	}

}
