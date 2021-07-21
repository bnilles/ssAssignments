/**
 * 
 */
package com.ss.jb2.assign1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bnilles
 *
 */
public class Adder {
	
	// this method will take a string array input and convert the ints into a int list and then will return int list and will discard any NaN's
	private List<Integer> getNumArray(String[] strArray) throws NullPointerException {
		List<Integer>  results = new ArrayList<Integer>();
		for(String s : strArray) {
			try {
				results.add(Integer.parseInt(s));
			}
			catch (Exception e) {
				System.out.println(s + " is not an integer and has been removed from the count");
				continue;
			}
		}
		return results;
	}
	
	// this is a public function that will sum the nums in a string array calls on numArray returns sum
	public int addArray(String[] strArray) {
		List<Integer> numArray = getNumArray(strArray);
		int sum = 0;
		for(int i : numArray) {
			sum += i;
		}
		return sum;
	}

}
