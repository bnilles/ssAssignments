/**
 * 
 */
package com.ss.jb5.dateTime.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ss.jb5.dateTime.DTAssigns;

/**
 * @author bnilles
 *
 */
public class DTAssignsTest {
	DTAssigns dt = new DTAssigns();
	
	@Test
	public void getLengthOfMonthsTest() {
		List<String> strings = new ArrayList<>();
		strings.add("JANUARY : 31");
		strings.add("FEBRUARY : 28");
		strings.add("MARCH : 31");
		strings.add("APRIL : 30");
		strings.add("MAY : 31");
		strings.add("JUNE : 30");
		strings.add("JULY : 31");
		strings.add("AUGUST : 31");
		strings.add("SEPTEMBER : 30");
		strings.add("OCTOBER : 31");
		strings.add("NOVEMBER : 30");
		strings.add("DECEMBER : 31");
		assertEquals(strings,dt.getLengthOfMonths(2021));
	}
	@Test
	public void getModaysTest() {
		List<LocalDate> ld = new ArrayList<>();
		ld.add( LocalDate.of(2021, 7, 5));
		ld.add( LocalDate.of(2021, 7, 12));
		ld.add( LocalDate.of(2021, 7, 19));
		ld.add( LocalDate.of(2021, 7, 26));
		assertEquals(ld, dt.getMondays(7));
	}
	@Test
	public void isFri13thTest() {
		assertTrue(dt.isFri13th(LocalDate.of(2021, 8, 13)));

		assertFalse(dt.isFri13th(LocalDate.of(2021, 7, 13)));
		assertFalse(dt.isFri13th(LocalDate.of(2021, 7, 2)));

		
	}

}
