package com.ss.jbWk1.assign6;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SampleSingleton {

	
	
	
	private static Connection conn = null;

	private static SampleSingleton instance = null;
	
	private SampleSingleton() {};
	

	synchronized public static SampleSingleton getInstance() {
		if(instance == null) {
			instance = new SampleSingleton();
		}
		return instance;
	}
//	public static void main(String[] args) {
//		SampleSingleton s1 = new SampleSingleton();
//		SampleSingleton s2 = new SampleSingleton();
//		
//	}


}
