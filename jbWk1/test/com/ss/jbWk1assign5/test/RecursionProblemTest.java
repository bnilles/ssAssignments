package com.ss.jbWk1assign5.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ss.jbWk1.assign5.RecursionProblem;

public class RecursionProblemTest {
	
	RecursionProblem rp = new RecursionProblem();
	int[] dirtyArray = {1,2,2,2,2,3,3,4,5,5,5};
	List<Integer> integers = new ArrayList<>();
 	@Test
	public void getCleanListTest() {
		integers.add(1);
		integers.add(8);
		integers.add(6);
		integers.add(4);
		integers.add(15);
		assertEquals(integers,rp.getCleanList(dirtyArray) );
		integers.clear();
		integers.add(99);
		assertEquals(integers,rp.getCleanList(new int[] {99}));
		
		integers.clear();
		integers.add(15);
		assertEquals(integers,rp.getCleanList(new int[] {5,5,5}));

	}
 	@Test
 	public void groupSumClumpTest () {
 		integers.clear();
 		integers.add(1);
		integers.add(8);
		integers.add(6);
		integers.add(4);
		integers.add(15);
 		assertTrue(rp.groupSumClump(0, integers, 18));
 		assertFalse(rp.groupSumClump(0, integers, 17));
 	}

}
