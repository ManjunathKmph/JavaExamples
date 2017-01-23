package com.manju.examples;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author manjunath
 * @version 1.0
 * 
 * Class prints the file paths inside the directory.
 * Also it filters the paths using filter options.
 *
 */
public class DirectoryStreamClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Program Files\\Java\\jdk1.8.0_60\\bin");
		try(DirectoryStream<Path> paths = Files.newDirectoryStream(path,"java?.exe")) {
			for(Path fpath : paths) {
				System.out.println(fpath);
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Second Approach");
		
		DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
			
			public boolean accept(Path entry) throws IOException {
				return !Files.isHidden(entry); 
			}
		};
		
		try(DirectoryStream<Path> paths = Files.newDirectoryStream(path,filter)) {
			for(Path fpath : paths) {
				System.out.println(fpath);
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
