/**
 * 
 */
package com.quicktap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Aashish
 *
 */
@Component
public class SyncService {
	
	@Autowired
	private SurveyService surveyService;
	
	public boolean loginQuickTap(String username){
		return false;
	}
	
	public void synchSurveys(String username){
		surveyService.synchSurveys(username);
	}

	/**
	 * @param survey_id
	 * @param username 
	 */
	public void syncResponses(int survey_id, String username) {
		surveyService.syncResponses(survey_id,username);
	}
}