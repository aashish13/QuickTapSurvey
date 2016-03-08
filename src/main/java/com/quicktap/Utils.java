/**
 * 
 */
package com.quicktap;

import java.time.Instant;
import java.util.Date;

import org.neo4j.cypher.internal.frontend.v2_3.perty.recipe.DocRecipe.strategyExpander;

import lombok.NonNull;

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
	public static int getIdByQuestion(@NonNull String string) {
		return Integer.valueOf(string.trim().substring(0, 2).trim());
	}
	
	public static String getOnlyTitle(@NonNull String title) {
		return title.substring(title.indexOf("-")+1,title.length());
	}
}
