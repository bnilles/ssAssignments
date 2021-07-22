/**
 * 
 */
package com.ss.jb3.assign3;

import java.io.FileReader;

/**
 * @author bnilles
 *
 */
public class CharCounter {
	
	
	//this method opens the file and counts the amount of chars. input path = path to file to check, c = the char to count, returns the count, -1 if there was and error
	public int countCharsInFile(String path, char c) {
		int charFromFile, count = 0;
		try(FileReader fr = new FileReader(path)) {
			while((charFromFile = fr.read()) != -1 ) {
				if( (char) charFromFile == c) {
					count++;
				}
			}
			return count;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("there was an error, please try again");
			return -1;

		}
	}

}
