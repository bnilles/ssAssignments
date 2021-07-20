/**
 * 
 */
package com.ss.jb1.assign1;

/**
 * @author bnilles
 *
 */
public class Pattern {
	
	//prints the pattern in part 1
	public void printPart1() {
		System.out.println("1)");
		for(int i = 0; i < 4; i++) {
			System.out.print("*".repeat(i + 1));
			System.out.println();
		}
		System.out.println(".........");
	}
	
	//prints the pattern in part 2
	public void printPart2() {
		System.out.println("2)");
		System.out.println("..........");
		for(int i = 3; i >= 0; i--) {
			System.out.print("*".repeat(i + 1));
			System.out.println();
		}
	}
	
	//prints the pattern in part 3
	public void printPart3() {
		System.out.println("3)");
		for(int i = 0; i < 4; i++) {
			System.out.print(" ".repeat(5 - i));
			System.out.print("*".repeat(2 * i + 1));
			System.out.println();
		}
		System.out.println("...........");
	}
	
	//prints the pattern in part 4
	public void printPart4() {
		System.out.println("4)");
		System.out.println("............");
		for(int i = 3; i >= 0; i--) {
			System.out.print(" ".repeat(5 - i));
			System.out.print("*".repeat(2 * i + 1));
			System.out.println();
		}
	}
	// prints all 4 patterns at the same time in order
	public void printAllParts() {
		this.printPart1();
		this.printPart2();
		this.printPart3();
		this.printPart4();
	}

}

