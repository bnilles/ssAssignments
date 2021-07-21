/**
 * 
 */
package com.ss.jb2.assign1;

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
		Adder a = new Adder();
		try {
			System.out.println(a.addArray(args));
		} catch (NullPointerException e) {
			System.out.println("there was an issue with the inputs");
		}
		
	}

}
