/**
 * 
 */
package com.ss.jb5.assign1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author bnilles
 *
 */
public class StringSorter {

	/**
	 * @param args
	 */

	public String[] SortAsc(String[] strings) {
		Arrays.sort(strings, (a, b) -> a.length() - b.length());
		return strings;
	}

	public String[] SortDesc(String[] strings) {
		Arrays.sort(strings, (a, b) -> b.length() - a.length());
		return strings;
	}

	public String[] SortDescFirstChar(String[] strings) {
		Arrays.sort(strings, (a, b) -> b.toLowerCase().charAt(0) - a.toLowerCase().charAt(0));
		return strings;
	}

	public String[] SortAscFirstChar(String[] strings) {
		Arrays.sort(strings, (a, b) -> a.toLowerCase().charAt(0) - b.toLowerCase().charAt(0));
		return strings;
	}

	public String[] SortEFirst(String[] strings) {
		Arrays.sort(strings, (a, b) -> {

			if (a.toLowerCase().contains("e")) {
				if (b.toLowerCase().contains("e")) {
					return 0;
				} else {
					return -1;
				}
			} else {
				if (b.toLowerCase().contains("e")) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		return strings;
	}
	
	public static Comparator<String> sortE = new Comparator<String>() {

		@Override
		public int compare(String a, String b) {
			if (a.toLowerCase().contains("e")) {
				if (b.toLowerCase().contains("e")) {
					return 0;
				} else {
					return -1;
				}
			} else {
				if (b.toLowerCase().contains("e")) {
					return 1;
				} else {
					return 0;
				}
			}
		}
		
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] demoStrings = { "This", "is", "a", "test", "string", "to", "see", "how", "stringSort", "works", "with",
				"lambdas" };

		StringSorter ss = new StringSorter();

		System.out.println("\nunsorted\n");
		for (String s : demoStrings) {
			System.out.println(s);
		}

		System.out.println("\nSorted ASC\n");
		ss.SortAsc(demoStrings);
		for (String s : demoStrings) {
			System.out.println(s);
		}

		System.out.println("\nSorted DESC\n");
		ss.SortDesc(demoStrings);
		for (String s : demoStrings) {
			System.out.println(s);
		}

		System.out.println("\nSorted DESC First Char\n");
		ss.SortDescFirstChar(demoStrings);
		for (String s : demoStrings) {
			System.out.println(s);
		}

		System.out.println("\nSorted ASC First Char\n");
		ss.SortAscFirstChar(demoStrings);
		for (String s : demoStrings) {
			System.out.println(s);
		}
		
		System.out.println("\nSorted 'E' First \n");
		ss.SortEFirst(demoStrings);
		for (String s : demoStrings) {
			System.out.println(s);
		}
		
		System.out.println("\nSorted 'E' First Using helper method \n");
		Arrays.sort(demoStrings, sortE);
		for (String s : demoStrings) {
			System.out.println(s);
		}

	}

}
