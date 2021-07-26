/**
 * 
 */
package com.ss.jbWk1.assign4.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ss.jbWk1.assign4.StringXRemover;

/**
 * @author bnilles
 *
 */
public class StringXRemoverTest {

	StringXRemover sr = new StringXRemover();
	List<String> strings = new ArrayList<>();
	List<String> expectedResults = new ArrayList<>();
	@Test
	public void noX() {
		strings.add("xxax");
		strings.add("abc");
		strings.add("abcx");
		strings.add("xxxxxxxxxx");
		strings.add("wzxv");
		
		expectedResults.add("a");
		expectedResults.add("abc");
		expectedResults.add("abc");
		expectedResults.add("");
		expectedResults.add("wzv");
		assertEquals(expectedResults,sr.noX(strings));
		
	}
}
