/**
 * 
 */
package com.ss.jb4.assign3;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author bnilles
 *
 */
public class ProCon {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> buf = new LinkedList<>();

		Thread producer = new Thread(() -> {
			try {
				
				for (int i = 0; i < 1000; i++) {
					synchronized (buf) {
						if (buf.size() < 10) {
							buf.add(i);
							System.out.println("produced: " + i);
							
						}
						else {
							Thread.sleep(100);
						}
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		});
		
		Thread consumer = new Thread(() -> {
			try {
				for (int i = 0; i < 1000; i++) {
					synchronized (buf) {
						if (buf.size() > 0) {
							System.out.println("Consumed: " + buf.poll());
							
						}
						else {
							Thread.sleep(100);
						}
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		});
		
		producer.start();
		consumer.start();

	}

}
