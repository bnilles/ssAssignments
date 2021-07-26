/**
 * 
 */
package com.ss.jbWk1.assign1;

import java.util.Scanner;

/**
 * @author bnilles
 *
 */
public class LambdasProblem {

	/**
	 * @param args
	 */


	public static PerformOperation isOdd() {
		return num -> {
			if (num % 2 == 0) {
				return false;
			} else {
				return true;
			}
		};
	}

	public static PerformOperation isPrime() {
		return num -> {
			if(num == 1) {
				return false;
			}
			for (int i = 2; i <= Math.sqrt((double) num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		};
	}

	public static PerformOperation isPalindrone() {
		return num -> {

			if (Integer.toString(num).equals(new StringBuilder(Integer.toString(num)).reverse().toString())) {
				return true;
			} else {
				return false;
			}
		};
	}
	
	public static boolean tester(PerformOperation p, int num) {
		return p.test(num);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int select, num;

		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();
		for (int i = 0; i < total; i++) {
			select = scanner.nextInt();
			num = scanner.nextInt();
			if (select == 1) {
				//po = LambdasProblem.isOdd();
				if (LambdasProblem.tester(LambdasProblem.isOdd(), num) == true) {
					System.out.println("ODD");
				} else {
					System.out.println("EVEN");
				}
			} else if (select == 2) {
				// 2
				//po = LambdasProblem.isPrime();
				if (LambdasProblem.tester(LambdasProblem.isPrime(), num) == true) {
					System.out.println("PRIME");
				} else {
					System.out.println("COMPOSITE");
				}
			} else if (select == 3) {
				//po = LambdasProblem.isPalindrone();
				if (LambdasProblem.tester(LambdasProblem.isPalindrone(), num) == true) {
					System.out.println("PALINDROME");
				} else {
					System.out.println("NOT PALINDROME");
				}
			}
		}
	}

}
