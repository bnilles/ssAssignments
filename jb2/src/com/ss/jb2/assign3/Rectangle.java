/**
 * 
 */
package com.ss.jb2.assign3;

/**
 * @author bnilles
 *
 */
public class Rectangle implements Shape {
	private int length, width;
	

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void calculateArea() {
		System.out.println("length * width= " + length * width);
	}

	@Override
	public void display() {
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
	}

}
