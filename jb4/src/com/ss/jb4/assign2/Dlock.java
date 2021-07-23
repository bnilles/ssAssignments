/**
 * 
 */
package com.ss.jb4.assign2;

/**
 * @author bnilles
 *
 */
public class Dlock {

	/**
	 * @param args
	 */

	static class StaticNestedClassExample {
		private String name;

		public StaticNestedClassExample(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public synchronized void doThis(StaticNestedClassExample reciever) {
			System.out.println(this.getName() + " does this to " + reciever.getName());
			reciever.doThat(this);
		}

		public synchronized void doThat(StaticNestedClassExample reciever) {
			System.out.println(this.getName() + " does that back to " + reciever.getName());
		}
	}

	public static void main(String[] args) {
		StaticNestedClassExample a = new StaticNestedClassExample("Alphonse");
		 StaticNestedClassExample b = new StaticNestedClassExample("Gaston");
		new Thread(new Runnable() {
			@Override
			public void run() {
				a.doThis(b);
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				b.doThis(a);
			}
		}).start();
	}

}
