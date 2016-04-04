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
	public static int getIdByQuestion(String string) {
		try {
			return Integer.valueOf(string.trim().substring(0, 2).trim());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public static String getOnlyTitle(String title) {
		return title.substring(title.indexOf("-")+1,title.length());
	}
	
	
}
