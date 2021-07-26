/**
 * 
 */
package com.ss.jb5.assign1.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.ss.jb5.assign1.StringSorter;

/**
 * @author bnilles
 *
 */
public class StringSorterTest {
	
	String[] demoStrings = { "The","first","anyone","has","heard" };
	StringSorter ss = new StringSorter();
	
	@Test
	public void sortAscTest() {
		demoStrings =new String[] { "The","first","anyone","has","heard" };
		assertArrayEquals(new String[] {"The","has","first","heard","anyone"},ss.SortAsc(demoStrings));
	}
	@Test
	public void sortDescTest() {
		demoStrings =new String[] { "The","first","anyone","has","heard" };
		assertArrayEquals(new String[] {"anyone","first","heard", "The","has"  },ss.SortDesc(demoStrings));
	}
	@Test
	public void sortAscFirstCharTest() {
		demoStrings =new String[] { "The","first","anyone","has","heard" };
		assertArrayEquals(new String[] {"anyone","first","has","heard", "The"  },ss.SortAscFirstChar(demoStrings));
	}
	@Test
	public void sortDescFirstCharTest() {
		demoStrings =new String[] { "The","first","anyone","has","heard" };
		assertArrayEquals(new String[] {"The","has","heard","first","anyone"  },ss.SortDescFirstChar(demoStrings));
	}
	@Test
	public void sortEFirstTest() {
		demoStrings =new String[] { "The","first","anyone","has","heard" };
		assertArrayEquals(new String[] {"The","anyone","heard","first","has" },ss.SortEFirst(demoStrings));
	}
	@Test
	public void sortEFirstWithHelperTest() {
		demoStrings =new String[] { "The","first","anyone","has","heard" };
		Arrays.sort(demoStrings,StringSorter.sortE);
		assertArrayEquals(new String[] {"The","anyone","heard","first","has" }, demoStrings);
	}

}
