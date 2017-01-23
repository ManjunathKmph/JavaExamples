package com.manju.examples;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author manjunath
 * @version 1.o
 * 
 * Class reads the contents of the file.
 *
 */
public class FileWriterClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "This code creates the file with some dummy contents";
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(new URI("file:///F:/New%20Folder/Text1.txt")), Charset.defaultCharset())){
			writer.write(str);
			System.out.println("Done writing to the file.");
		} catch (IOException | URISyntaxException ex) {
			System.err.println(ex.getMessage());
		}
	}

}
