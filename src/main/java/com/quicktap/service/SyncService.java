/**
 * 
 */
package com.quicktap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quicktap.data.entity.Surveys;

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
	 * @param sync
	 * @param username 
	 */
	public void syncResponses(String sync, String username) {
		List<Surveys> surveys=surveyService.getSurveyByUsername(username);
		for (Surveys survey : surveys) {
			try{
				syncResponses(survey.getId(),username);
				Thread.sleep(330);
			}
			catch(InterruptedException ie){
				System.out.println("Interupted exception while delaying the request by 30 Seconds" + ie);
			}
		}
		
	}
	
	public void syncResponses(int id, String username) {
			surveyService.syncResponses(id,username);
	}
}