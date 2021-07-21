/**
 * 
 */
package com.ss.jb2.assign3;

/**
 * @author bnilles
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(25, 11);
		r.display();
		r.calculateArea();
		
		Circle c = new Circle(9);
		c.display();
		c.calculateArea();
		
		Triangle t = new Triangle(3, 5, 7);
		t.display();
		t.calculateArea();
	}

}
