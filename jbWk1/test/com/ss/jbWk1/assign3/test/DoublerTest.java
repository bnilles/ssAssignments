/**
 * 
 */
package com.ss.jbWk1.assign3.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ss.jbWk1.assign3.Doubler;

/**
 * @author bnilles
 *
 */
public class DoublerTest {

	Doubler d = new Doubler();
	List<Integer> integers = new ArrayList<>();
	List<Integer> expectedOutput = new ArrayList<>();
	
	
	@Test
	public void DoubleTest() {
		integers.add(33);
		integers.add(2);
		integers.add(0);
		integers.add(999);
		
		expectedOutput.add(66);
		expectedOutput.add(4);
		expectedOutput.add(0);
		expectedOutput.add(1998);
		assertEquals(expectedOutput, d.getDoubleList(integers));
	}
}
