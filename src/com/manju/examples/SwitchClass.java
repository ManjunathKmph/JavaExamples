package com.manju.examples;

/**
 * @author manjunath
 * @version 1.0
 * 
 * Class uses switch statement to have string case.
 *
 */
public class SwitchClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name  = "Manjunath";
		switch (name) {
		case "Manjunath":
			System.out.println("Welcome Manjunath");
			break;
		default:
			System.out.println("No one is welcomed");
		}
	}

}
