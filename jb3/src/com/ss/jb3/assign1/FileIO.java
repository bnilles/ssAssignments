/**
 * 
 */
package com.ss.jb3.assign1;

import java.io.File;


/**
 * @author bnilles
 *
 */
public class FileIO {
	
	
	// this method starts the recursive proccess to print all files and dirs input is the starting dir path
	public void printFilesAndDirsRecursive (String path) {
		File dirPath = new File(path);
		File[] files = dirPath.listFiles();
		try {
			for(File f: files) {
				if(f.isDirectory()) {
					System.out.println("(" +f.getName() + ")");
					printFilesAndDirsRecursive(f.getAbsolutePath(), 1);
				} else {
					System.out.println(f.getName());
				}
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		
	}
	// this method is the recursive part that allows for the sub-dirs to be indented for better viewing depth is level of sub-dir
	private void printFilesAndDirsRecursive (String path, int depth ) {
		File dirPath = new File(path);
		File[] files = dirPath.listFiles();
		String indentMarker = "    ";
		try {
			for(File f: files) {
				if(f.isDirectory()) {
					System.out.println(indentMarker.repeat(depth) +"(" +f.getName() + ")");
					printFilesAndDirsRecursive(f.getAbsolutePath(), depth + 1);
				} else {
					System.out.println(indentMarker.repeat(depth) + f.getName());
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
