/**
 * 
 */
package com.ss.jb3.assign2;

import java.io.File;
import java.io.FileWriter;

/**
 * @author bnilles
 *
 */
public class Appender {
	
	//this file opens the file and appends the text to the end. inputs are path to file to write to and the string to write, returns true on success and false on failure
	public Boolean appendTextToFile(String pathToFile, String textToAppend) {
		
		try {
			File file = new File(pathToFile);
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file,true);
			fw.write(textToAppend);
			fw.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

}
