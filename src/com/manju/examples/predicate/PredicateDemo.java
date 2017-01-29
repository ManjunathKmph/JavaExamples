package com.manju.examples.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	
	public <T> List<T> testPredicate01(Predicate<T> p, List<T> list) {
		final List<T> returnedList = new ArrayList<>();
		for(T num : list) {
			if(p.test(num)) {
				returnedList.add(num);
			}
		}
		return returnedList;
	}
	
	public <T> List<T> testPredicateNegate(Predicate<T> p, List<T> list) {
		final List<T> returnedList = new ArrayList<>();
		for(T num : list) {
			if(p.negate().test(num)) {
				returnedList.add(num);
			}
		}
		return returnedList;
	}
	
	public <T> List<T> testPredicateOr(Predicate<T> p1, Predicate<T> p2, List<T> list) {
		final List<T> returnedList = new ArrayList<>();
		for(T num : list) {
			if(p1.or(p2).test(num)) {
				returnedList.add(num);
			}
		}
		return returnedList;
	}
	
	public <T> List<T> testPredicateAnd(Predicate<T> p1, Predicate<T> p2, List<T> list) {
		final List<T> returnedList = new ArrayList<>();
		for(T num : list) {
			if(p1.and(p2).test(num)) {
				returnedList.add(num);
			}
		}
		return returnedList;
	}

}
