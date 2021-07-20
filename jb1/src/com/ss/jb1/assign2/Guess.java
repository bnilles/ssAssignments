/**
 * 
 */
package com.ss.jb1.assign2;

import java.util.Random;
import java.util.Scanner;

/**
 * @author bnilles
 *
 */
public class Guess {

	private int randomNumber;
	private int getRandomNumber(int upperBound) {
		Random rand = new Random();
		return rand.nextInt(upperBound) + 1;

	}
	private int getUserGuess() {
		int guess = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Please enter a number from 1 to 100 (integers only) then press enter.");
			String userInput = scanner.nextLine();
			if(isPositiveNumber(userInput)) {
				guess = Integer.parseInt(userInput);
				if(guess >= 1 && guess <= 100) {
					
					return guess;
				}
				else {
					System.out.println("Number was not between 1 and 100.");
					continue;
				}
			}
			else {
				System.out.println("Input was not a number.");
				continue;
			}
		}while(true);
	}
	
	private boolean isPositiveNumber (String str) {
		if(str == null || str.length() == 0) {
			return false;
		}
		for(char c : str.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
	
	public void runGame(int guessAttempts, int distanceFromRandom) {
		int randomNumber = getRandomNumber(100);
		int userInput = 0;
		for(int i  = guessAttempts; i > 0; i--) {
			userInput = getUserGuess();
			if(Math.abs(randomNumber - userInput) <= distanceFromRandom) {
				System.out.println("Congrats the number was " + randomNumber);
				return;
			}
			else {
				System.out.println("Your guess was not close enough guess again.");
			}
		}
		System.out.println("Sorry you have run out of tries.");
		return;
	}
	
}
