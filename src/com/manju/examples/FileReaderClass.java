package com.manju.examples;

import java.io.BufferedReader;
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
public class FileReaderClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = null;
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(new URI("file:///F:/New%20Folder/Text.txt")), Charset.defaultCharset())){
			while((str = reader.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException | URISyntaxException ex) {
			System.err.println(ex.getMessage());
		}
	}

}
