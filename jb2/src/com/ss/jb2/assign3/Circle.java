/**
 * 
 */
package com.ss.jb2.assign3;

/**
 * @author bnilles
 *
 */
public class Circle implements Shape {
	
	private int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public void setradius(int radius) {
		this.radius = radius;
	}
	

	@Override
	public void calculateArea() {
		System.out.println("π * radius^2 = " + Math.PI * (radius * radius));
	}

	@Override
	public void display() {
		System.out.println("radius: " + radius);
	}

}
