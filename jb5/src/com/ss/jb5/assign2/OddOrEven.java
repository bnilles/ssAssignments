/**
 * 
 */
package com.ss.jb5.assign2;

import java.util.StringJoiner;

/**
 * @author bnilles
 *
 */
public class OddOrEven {
 
	/**
	 * @param args
	 */
	
	public String checkOddOrEven  (Integer[] integers ) {
		StringJoiner joinNumbers = new StringJoiner(",");
		for (Integer integer : integers) {
			if(integer % 2  == 0) {
				joinNumbers.add("e" + integer);
			} else {
				joinNumbers.add("o" + integer);
			}
		}
		
		return joinNumbers.toString();
	}
	
	public static void main(String[] args) {

		
		OddOrEven ooe = new OddOrEven();
		Integer[] integers  = {1,2,34,4,5,23,32,2,3,0};
		System.out.println(ooe.checkOddOrEven(integers));
	}

}
