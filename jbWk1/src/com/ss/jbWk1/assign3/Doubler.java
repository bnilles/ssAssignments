/**
 * 
 */
package com.ss.jbWk1.assign3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author bnilles
 *
 */
public class Doubler {

	/**
	 * @param args
	 */
	
	// this method maps over a list of INtegers and returns a list with every element doubled
	public List<Integer> getDoubleList(List<Integer> integers) {
		List<Integer> resultIntegers =  integers.stream().map((x) -> x*= 2  ).collect(Collectors.toList());
		return resultIntegers;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doubler rm = new Doubler();
		List<Integer> integers = new ArrayList<Integer>(); 
		integers.add(6);
		integers.add(8);
		integers.add(6);
		integers.add(8);
		integers.add(-1);
		System.out.println(rm.getDoubleList(integers));
			
	}

}
