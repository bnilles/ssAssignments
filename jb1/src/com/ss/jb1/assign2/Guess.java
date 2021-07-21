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
	
	//generates a random number from 1 to the uperbound(inclusive) and returns it
	private int getRandomNumber(int upperBound) {
		Random rand = new Random();
		return rand.nextInt(upperBound) + 1;

	}
	
	// gets the users guess and makes sure that it is a number that is between 1-100(inclusive) and will alert the user if not a number or not in range and returns the users input
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
	
	// checks if the string passed in is a positive int returns a bool
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
	
	//runs the game inputs are number of guess attempts to give user and the distance from random number that counts as a success
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
