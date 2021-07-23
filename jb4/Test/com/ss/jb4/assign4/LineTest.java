package com.ss.jb4.assign4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class LineTest {
	Line line = new Line(2.0, 4.0, 6.0, 8.0);
	
	@Test
	public void getSlopeTest() {
		assertEquals(1, line.getSlope(),.001);
		
	}
	@Test(expected=ArithmeticException.class)
	public void CalculatorTestDivisionByZero(){
	    Line testLine = new Line(4,4,4,4);
	    testLine.getSlope();
	}
	
	@Test
	public void getDistanceTest() {
		assertEquals(5.6568, line.getDistance(),.001);
	}
	
	@Test
	public void parallelTo() {
		assertTrue(line.parallelTo(new Line(0,2,4,6)));
		assertFalse(line.parallelTo(new Line(1,2,4,6)));
	}
}
