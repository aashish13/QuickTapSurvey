/**
 * 
 */
package com.quicktap.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quicktap.Utils;
import com.quicktap.data.dao.SurveyDao;
import com.quicktap.data.entity.Surveys;
import com.quicktap.integration.apihelper.Main;
import com.quicktap.integration.apihelper.data.ApiSurveyDO;

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
	
	public ArrayList synchAllSurveys(){
		//TODO directly using the method from main need to implement with jersey
		ApiSurveyDO[] surveys=Main.getSurveyList();
		
		for (int i = 0; i < surveys.length; i++) {
			Surveys survey=new Surveys();
			survey.setSurveyId(surveys[i].getSurveyId());
			survey.setName(surveys[i].getSurveyName());
			survey.setTotalResponses(surveys[i].getTotalResponses());
			survey.setLastSynchTime(Utils.getTime());
			if(surveyService.getById(surveys[i].getSurveyId())==null)
				surveyService.add(survey);
		}
		
		return null;
	}
}