/**
 * 
 */
package com.quicktap;

import java.time.Instant;
import java.util.Date;

/**
 * @author Aashish
 *
 */
public class Utils {

	/**
	 * @return
	 */
	public static Date getTime() {
		return Date.from(Instant.now());
	}
	
}
