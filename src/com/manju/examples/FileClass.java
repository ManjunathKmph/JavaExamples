package com.manju.examples;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

/**
 * @author manjunath
 * @version 1.0
 * 
 * Class prints the file attributes.
 *
 */
public class FileClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path path = Paths.get("F:/New Folder/Text.txt");
		Set<String> attributes = path.getFileSystem().supportedFileAttributeViews();
		for(String attribute : attributes) {
			System.out.println(attribute);
		}			
	}

}
