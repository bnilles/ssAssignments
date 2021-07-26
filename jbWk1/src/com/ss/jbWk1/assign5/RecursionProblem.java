/**
 * 
 */
package com.ss.jbWk1.assign5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bnilles
 *
 */
public class RecursionProblem {

	/**
	 * @param args
	 */
	
	// this method returns a list where any repeated identicle numbers are summed and replaced with their sum ex. 2,2,2,4,5 -> 6,4,5
	public List<Integer> getCleanList(int[] numbers) {
		List<Integer> numList = new ArrayList<Integer>();
		if (numbers.length == 1) {
			numList.add(numbers[0]);

			return numList;
		} else {
			if (numbers[0] != numbers[1]) {
				numList.add(numbers[0]);
			}
			for (int i = 1; i < numbers.length; i++) {
				if (numbers[i - 1] == numbers[i]) {

					int j = i;
					i -= 1;
					while (j < numbers.length) {
						if (numbers[i] != numbers[j]) {
							break;
						} else {
							j++;
						}
					}

					numList.add((j - i) * numbers[i]);
					i = j - 1;
				} else {

					if (numbers[i] != numbers[i + 1]) {
						numList.add(numbers[i]);
					}

				}

			}
		}
		return numList;
	}

	//this method recursivly chcecks all paths looking if their is a solution that adds up to the desired number
	public boolean groupSumClump(int index, List<Integer> numbers, int total) {
		if (index >= numbers.size()) {
			return total == 0;
		}
		if (groupSumClump(index + 1, numbers, total - numbers.get(index))) {
			return true;
		}
		if (groupSumClump(index + 1, numbers, total)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RecursionProblem rp = new RecursionProblem();
		int[] nums = { 2, 2, 2, 2, 3, 4, 5, 5, 5, 5, 6, 6 };
		List<Integer> numberList = rp.getCleanList(nums);
		for (Integer i : numberList) {
			System.out.println(i);
		}

		System.out.println(rp.groupSumClump(0, numberList, 99));
	}

}
