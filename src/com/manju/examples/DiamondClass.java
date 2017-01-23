package com.manju.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * @author manjunath
 * @version 1.0
 * 
 * Class uses the java 7 diamond operator.
 *
 */
public class DiamondClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> animalsList = new ArrayList<>();
		animalsList.add("Animal");
		animalsList.add("Animal1");
		animalsList.add("Animal2");
		System.out.println(animalsList);
	}

}
