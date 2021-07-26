/**
 * 
 */
package com.ss.jbWk1.assign4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bnilles
 *
 */
public class StringXRemover {

	/**
	 * @param args
	 */

	public List<String> noX(List<String> strings) {
		strings.replaceAll(s -> s.replace("x", ""));
		return strings;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringXRemover sxr = new StringXRemover();
		List<String> strings = new ArrayList<String>();
		strings.add("xxax");
		strings.add("xbxbx");
		strings.add("xxcx");
		strings.add("x");

		System.out.println(sxr.noX(strings));
	}

}
