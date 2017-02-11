package com.manju.examples.java8features;

/**
 * @author manju
 *
 */
public class Dog implements IAnimal {
	
	public void type() {
		System.out.println("Type -> Dog");
		IAnimal.super.type();
	}

	public static void main(String[] args) {
		IAnimal animal = new Dog();
		animal.type();
		IAnimal.eat();
	}

}
