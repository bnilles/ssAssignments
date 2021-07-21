/**
 * 
 */
package com.ss.jb2.assign3;

/**
 * @author bnilles
 *
 */
public class Triangle implements Shape {
	private int a, b, c;

	public Triangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void setA(int a) {
		this.a = a;
	}



	public void setB(int b) {
		this.b = b;
	}



	public void setC(int c) {
		this.c = c;
	}

	@Override
	public void calculateArea() {
		double p = (a = b + c)/2;
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - b) * (p - c));
		System.out.println("Area: " + area);
	}

	@Override
	public void display() {
		System.out.println("Side A: " + a);
		System.out.println("Side B: " + b);
		System.out.println("Side C: " + c);
	}

}
