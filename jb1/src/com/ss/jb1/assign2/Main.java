/**
 * 
 */
package com.ss.jb1.assign2;

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
		// TODO Auto-generated method stub
		Guess g = new Guess();
		Scanner scanner = new Scanner(System.in);
		String input = "";
		do {
			if (input.equals("run")) {
				g.runGame(5, 10);
			}
			System.out.println("enter run to run the program or exit to leave.");
			input = scanner.nextLine();
		} while (input.equals("exit") == false);
	}

}
