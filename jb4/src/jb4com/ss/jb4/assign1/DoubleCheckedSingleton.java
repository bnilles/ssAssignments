/**
 * 
 */
package jb4com.ss.jb4.assign1;

/**
 * @author bnilles
 *
 */
public class DoubleCheckedSingleton {
	
	private static DoubleCheckedSingleton instance;
	public static synchronized DoubleCheckedSingleton getInstance() {
		if(instance == null) {
			instance = new DoubleCheckedSingleton();
		}
		return instance;
	}
}
