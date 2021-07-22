/**
 * 
 */
package com.ss.jb3.assign3;

import java.util.Scanner;

/**
 * @author bnilles
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CharCounter cc = new CharCounter();
		
		try {
			Scanner scanner = new Scanner(System.in);
			String input = "";
			System.out.println("enter run to a char to check the count or \"exit\" to leave.");
			input = scanner.nextLine();
			
			while (input.equals("exit") == false) {
				System.out.println(cc.countCharsInFile("src\\assign3.txt", input.charAt(0)));
				System.out.println("enter run to a char to check the count or \"exit\" to leave.");
				input = scanner.nextLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("there was an input error");
		}
		

	}

}
