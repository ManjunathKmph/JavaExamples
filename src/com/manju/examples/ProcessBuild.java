package com.manju.examples;

import java.io.InputStream;

/**
 * Class runs the command and outputs the result to the console
 * using java api.
 * 
 * @author manjunath
 * @version 1.0
 *
 */
public class ProcessBuild {
	
	public static void main(String[] args) throws Exception {
		ProcessBuilder builder = new ProcessBuilder("cmd");
		builder.command("ipconfig");
		Process process = builder.start();
		InputStream inputStream = process.getInputStream();
		byte []contents = new byte[1024];
		while(inputStream.read() != -1) {
			inputStream.read(contents);
			System.out.println(new String(contents));
		}
	}
}
