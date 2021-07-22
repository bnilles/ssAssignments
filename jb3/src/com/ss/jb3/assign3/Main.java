/**
 * 
 */
package com.ss.jb3.assign3;

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
		char checkChar = 'x';
		CharCounter cc = new CharCounter();
		System.out.println(cc.countCharsInFile("src\\assign3.txt", checkChar));

	}

}
