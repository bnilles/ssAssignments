/**
 * 
 */
package com.ss.jb5.assign3.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ss.jb5.assign3.StringStream;

/**
 * @author bnilles
 *
 */
public class StringStreamTest {
	
	StringStream ss = new StringStream();
	
	@Test
	public void filterStringsTest () {
		List<String> strings = new ArrayList<>();
		List<String> resultStrings = new ArrayList<>();
		strings.add("asdf");
		strings.add("asd");
		strings.add("abc");
		strings.add("aaaaa");
		strings.add("as");
		strings.add("ABC");
		strings.add("aPQ");
		resultStrings.add("asd");
		resultStrings.add("abc");
		resultStrings.add("aPQ");
		
		assertEquals(resultStrings,ss.filterStrings(strings));
	}

}
