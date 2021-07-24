/**
 * 
 */
package com.ss.jb5.assign3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author bnilles
 *
 */
public class StringStream {

	/**
	 * @param args
	 */
	
	public List<String> filterStrings (List<String> strings) {
		
		List<String> resultStrings =  strings.stream().filter((s) -> s.startsWith("a") && s.length() == 3 ).collect(Collectors.toList());
		
		return resultStrings;
	}
	             
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = new ArrayList<String>();
		
		strings.add("abc");
		strings.add("basf");
		strings.add("abcd");
		strings.add("ab");
		strings.add("AAA");
		strings.add("aaa");
		strings.add("all");
		strings.add(" aas");
		strings.add("abe");
		strings.add("");
		

		
		StringStream ss = new StringStream();
		System.out.println(ss.filterStrings(strings));

	}

}
