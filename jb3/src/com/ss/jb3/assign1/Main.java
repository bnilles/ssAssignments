/**
 * 
 */
package com.ss.jb3.assign1;

import java.nio.file.Paths;

/**
 * @author bnilles
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileIO f = new FileIO();
		System.out.println("Starting dir: " + Paths.get("").toAbsolutePath().toString());
		f.printFilesAndDirsRecursive(Paths.get("").toAbsolutePath().toString());
	}

}
