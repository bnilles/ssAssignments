/**
 * 
 */
package com.ss.jbWk1.assign1.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ss.jbWk1.assign1.LambdasProblem;


/**
 * @author bnilles
 *
 */
public class LambdasProblemTest {
	
LambdasProblem lp = new LambdasProblem();

	
	@Test
	public void IsOddTest() {
		assertTrue( LambdasProblem.tester(LambdasProblem.isOdd(), 23));
		assertFalse( LambdasProblem.tester(LambdasProblem.isOdd(), 28));
		assertFalse( LambdasProblem.tester(LambdasProblem.isOdd(), 0));
		assertFalse( LambdasProblem.tester(LambdasProblem.isOdd(), 100));

	}
	
	
	@Test
	public void IsPrimeTest() {
		assertTrue( LambdasProblem.tester(LambdasProblem.isPrime(), 23));
		assertTrue( LambdasProblem.tester(LambdasProblem.isPrime(), 31));
		assertFalse( LambdasProblem.tester(LambdasProblem.isPrime(), 99));
		assertFalse( LambdasProblem.tester(LambdasProblem.isPrime(), 8));
		assertTrue( LambdasProblem.tester(LambdasProblem.isPrime(), 2));
		assertFalse( LambdasProblem.tester(LambdasProblem.isPrime(), 1));

		
	}
	@Test
	public void IsPalTest() {
		assertTrue( LambdasProblem.tester(LambdasProblem.isPalindrone(), 232));
		assertFalse( LambdasProblem.tester(LambdasProblem.isPalindrone(), 23));
		assertFalse( LambdasProblem.tester(LambdasProblem.isPalindrone(), 233));
		assertTrue( LambdasProblem.tester(LambdasProblem.isPalindrone(), 23332));
		
	}
	

}
