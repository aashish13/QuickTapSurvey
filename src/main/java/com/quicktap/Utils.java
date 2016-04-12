/**
 * 
 */
package com.quicktap;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.quicktap.data.entity.Questions;
import com.quicktap.data.entity.Surveys;

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
	/**
	 * @param survey
	 * @return
	 */
	public static Set<Integer> getQuestionTypeListFromSurvey(Set<Questions> set) {
		Set<Integer> questionIds=new HashSet<>();
		for (Questions questions : set) {
			questionIds.add(getIdByQuestion(questions.getTitle()));
		}
		return questionIds;
	}
	
	
}
