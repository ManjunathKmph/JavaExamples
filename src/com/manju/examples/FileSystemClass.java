package com.manju.examples;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * @author manjunath
 * @version 1.0
 * 
 * Class prints the computer file system information.
 *
 */
public class FileSystemClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileSystem filesystem = FileSystems.getDefault();
		System.out.println("Separator : " + filesystem.getSeparator());
		System.out.println("Is Open : " + filesystem.isOpen());
		System.out.println("Is Readonly : " + filesystem.isReadOnly());
		Iterable<Path> rootDirectories = filesystem.getRootDirectories();
		System.out.println("Root Directories : ");
		for(Path path : rootDirectories) {
			System.out.print(path + " ");
		}
		System.out.println();
		Iterable<FileStore> fileStores = filesystem.getFileStores();
		System.out.println("FileStores Names : ");
		for(FileStore fileStore : fileStores) {
			System.out.print(fileStore + " ");
		}
		System.out.println();
		System.out.println("Provider Name : " + filesystem.provider().getScheme());
	}

}
