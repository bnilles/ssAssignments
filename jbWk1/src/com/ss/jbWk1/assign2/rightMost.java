/**
 * 
 */
package com.ss.jbWk1.assign2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author bnilles
 *
 */
public class rightMost {

	/**
	 * @param args
	 */
	
	// gets the digit furthest to the right and returns a list of rightmost digits
	public List<Integer> getRightList(List<Integer> integers) {
		List<Integer> resultIntegers =  integers.stream().map((x) -> x % 10 ).collect(Collectors.toList());
		return resultIntegers;
	}
	public static void main(String[] args) {
		
		rightMost rm = new rightMost();
		List<Integer> integers = new ArrayList<Integer>(); 
		integers.add(16);
		integers.add(8);
		integers.add(886);
		integers.add(8);
		integers.add(1);
		System.out.println(rm.getRightList(integers));
			
	}

}
