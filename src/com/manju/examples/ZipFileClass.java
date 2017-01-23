package com.manju.examples;

import java.io.IOException;
import java.net.URI;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

/**
 * @author manjunath
 * @version 1.0
 * 
 * Class prints the paths inside the jar file.
 *
 */
public class ZipFileClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		URI zipFile = URI.create("jar:file:///C:/Program%20Files/Java/jdk1.8.0_60/jre/lib/rt.jar");
		Map<String, String> attributes = new HashMap<>();
		attributes.put("create", "true");
		
		try (FileSystem zipFileSystem = FileSystems.newFileSystem(zipFile, attributes)) {
			try (DirectoryStream<Path> stream = Files.newDirectoryStream(zipFileSystem.getPath("/"))) {
				for(Path fpath : stream) {
					System.out.println(fpath);
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}		

	}

}
