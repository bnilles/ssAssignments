/**
 * 
 */
package com.ss.jb2.assign2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author bnilles
 *
 */
public class Search {
	
	//this method creates a 2d int array filled with random numbers inputs are the dimensions of the array output is the array
	private int[][] generateRandom2dArray(int colLength, int rowLength) {
		int [][] randArray = new int [rowLength][colLength];
		Random rand = new Random();
		for(int i = 0; i < rowLength; i++) {
			for(int j = 0; j < colLength; j++) {
				randArray[i][j] = rand.nextInt(100);
			}
		}
		return randArray;
	}
	
	// this method prints the array to console input is the array
	private void printArray(int[][] intArray) {
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[0].length; j++) {
				System.out.print(intArray[i][j] + ",");
			}
			System.out.println();
		}

	}
	
	// this method gets the max value and locations and prints to the screen where they are input is the array to search
	private void getMax(int[][] intArray) {
		List<Integer> maxPositionsCol = new ArrayList<Integer>();
		List<Integer> maxPositionsRow = new ArrayList<Integer>();
		int maxValue = -1;
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[0].length; j++) {
				if(maxValue < intArray[i][j]) {
					maxValue = intArray[i][j];
					maxPositionsCol.clear();
					maxPositionsRow.clear();
					maxPositionsRow.add(i);
					maxPositionsCol.add(j);
				}
				else if(maxValue == intArray[i][j]) {
					maxPositionsRow.add(i);
					maxPositionsCol.add(j);
				}
			}
		}
		System.out.print("The max value was " + maxValue + " at postion[s] ");
		for(int i = 0; i < maxPositionsCol.size(); i++) {
			System.out.print(" [" + maxPositionsRow.get(i) + ", " + maxPositionsCol.get(i) + "]");
		}
	}
	
	//this is the public function that runs the generate array, print array and getMax methods
	public void run() {
		int[][] nums = generateRandom2dArray(10,10);
		printArray(nums);
		getMax(nums);
	}
}
