/**
 * 
 */
package com.ss.jb5.dateTime;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bnilles
 *
 */
public class DTAssigns {

	/**
	 * @param args
	 */
	
	public List<String> getLengthOfMonths (int year) {
		List <String> strings = new ArrayList<>();
		for(Month m : Month.values()) {
			strings.add(m + " : " + YearMonth.of(year, m).lengthOfMonth());
		}
		return strings;
	}
	
	public List<LocalDate> getMondays(int month) {
		LocalDate ldt2 = LocalDate.of(2021, month, 1);
		List<LocalDate> dates = new ArrayList<>();
		if(ldt2.getDayOfWeek() != DayOfWeek.MONDAY) {
			ldt2 = ldt2.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		}
		while(ldt2.getMonth() == Month.of(month)) {
			dates.add( ldt2);
			ldt2 = ldt2.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		}
		return dates;
	}
	
	public boolean isFri13th(LocalDate ld) {
		if(ld.getDayOfWeek() == DayOfWeek.FRIDAY && ld.getDayOfMonth() == 13) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		DTAssigns dt = new DTAssigns();
		
		//q1. Which class would you use to store your birthday in years, months, days, seconds, and nanoseconds?
		// Answer.  I would use LocalDateTime
		LocalDateTime ldt = LocalDateTime.of(1992,8,6,0,0);
		System.out.println(ldt.toString());
		
		//q2.Given a random date, how would you find the date of the previous Thursday?
		
		System.out.println(ldt.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)));
		
		//q3. What is the difference between a ZoneId and a ZoneOffset?
		// a3. They both track the difference from utc but with zoneid you can search by country 
		
		//q4. How would you convert an Instant to a ZonedDateTime? How would you convert a ZonedDateTime to an Instant?
		ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		Instant inst = ZonedDateTime.now().toInstant();
		
		//q5. Write an example that, for a given year, reports the length of each month within that year.
		List<String> daysInMonths = dt.getLengthOfMonths(2021);
		for(String s : daysInMonths) {
			System.out.println(s);
		}
		
		//q6. Write an example that, for a given month of the current year, lists all of the Mondays in that month.
		
		
		List<LocalDate> dates = dt.getMondays(1);
		for(LocalDate d : dates) {
			System.out.println(d.getMonthValue() + "/" + d.getDayOfMonth());
		}

		
		//q6. Write an example that tests whether a given date occurs on Friday the 13th.
		
		LocalDate ld = LocalDate.of(2021, 8, 13);
		System.out.println("is friday the 13th: " + dt.isFri13th(ld));
	}

}
