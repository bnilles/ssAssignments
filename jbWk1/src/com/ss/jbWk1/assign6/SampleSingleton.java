package com.ss.jbWk1.assign6;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SampleSingleton {

	
	
	
	private static Connection conn = null;

	private static SampleSingleton instance = null;
	
	

	synchronized public static SampleSingleton getInstance() {
		if(instance == null) {
			instance = new SampleSingleton();
		}
		return instance;
	}
	


}
