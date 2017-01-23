package com.manju.examples;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author manjunath
 * @version 1.0
 * 
 * Class prints the file attributes.
 *
 */
public class FileSystemAttributesClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Path path = Paths.get(new URI("file:///F:/New%20Folder/New%20Text%20Document.txt"));
			BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
			System.out.println("Creation Time : " + attributes.creationTime());
			System.out.println("File Size : " + attributes.size());
			System.out.println("Last Access Time : " + attributes.lastAccessTime().toMillis());
			System.out.println("Last Modified Time : " + attributes.lastModifiedTime().toMillis());
			System.out.println("File Key : " + attributes.fileKey());
			System.out.println("Is Directory : " + attributes.isDirectory());
			System.out.println("Is Regular File : " + attributes.isRegularFile());
			System.out.println("Is symbolic linke : " + attributes.isSymbolicLink());			
		} catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}
	}

}
