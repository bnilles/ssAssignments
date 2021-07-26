/**
 * 
 */
package com.ss.jbWk1.assign2.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ss.jbWk1.assign2.rightMost;

/**
 * @author bnilles
 *
 */
public class RightMostTest {
	rightMost rm = new rightMost();
	List<Integer> integers = new ArrayList<Integer>();
	List<Integer> expectedOutput = new ArrayList<Integer>();
	
	@Test
	public void getRightMostTest() {
		integers.add(232);
		integers.add(9875);
		integers.add(23);
		integers.add(0);
		
		expectedOutput.add(2);
		expectedOutput.add(5);
		expectedOutput.add(3);
		expectedOutput.add(0);
		
		
		assertEquals( expectedOutput, rm.getRightList(integers));
		
	}
	
}
