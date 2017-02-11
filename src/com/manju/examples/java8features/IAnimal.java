package com.manju.examples.java8features;

/**
 * @author manju
 *
 */
public interface IAnimal {
	
	static void eat() {
		System.out.println("Eating");
	}
	
	default void type() {
		System.out.println("Type -> Animal");
	}

}
