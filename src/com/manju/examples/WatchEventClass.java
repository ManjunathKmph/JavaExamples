package com.manju.examples;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/**
 * @author manjunath
 * @version 1.0
 * 
 * Class creates watchable events like file creation, modification and deletion on the directory. 
 *
 */
public class WatchEventClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileSystem filesystem = FileSystems.getDefault();
		try {
			WatchService watchService = filesystem.newWatchService();
			Path path = Paths.get("F:\\New Folder");
			WatchEvent.Kind<?>[] events = {StandardWatchEventKinds.ENTRY_CREATE,
					StandardWatchEventKinds.ENTRY_MODIFY,
					StandardWatchEventKinds.ENTRY_DELETE};
			path.register(watchService, events);
			
			while(true) {
				System.out.println("Waiting for a watch event");
				WatchKey watchkey = watchService.take();
				System.out.println("Path being watched : " + watchkey.watchable());
				
				if(watchkey.isValid()) {
					for(WatchEvent<?> event : watchkey.pollEvents()) {
						System.out.println("Kind: " +
								event.kind());
								System.out.println("Context: " +
								event.context());
								System.out.println("Count: " +
								event.count());
								System.out.println();
					}
					
					boolean valid = watchkey.reset();
					if(!valid) {
					}
				}				
			}			
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

}
