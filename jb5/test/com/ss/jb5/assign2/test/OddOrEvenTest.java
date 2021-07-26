/**
 * 
 */
package com.ss.jb5.assign2.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ss.jb5.assign2.OddOrEven;

/**
 * @author bnilles
 *
 */
public class OddOrEvenTest {
	OddOrEven oe = new OddOrEven();
	Integer[] integers = new Integer[] {11,22,33,44,55,66};
	
	@Test
	public void CheckOddOrEvenTest () {
		assertEquals("o11,e22,o33,e44,o55,e66",oe.checkOddOrEven(integers));
	}
	
}
