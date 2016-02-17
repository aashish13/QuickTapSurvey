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
	private SurveyService surveyServise;
	
	public boolean loginQuickTap(String username){
		username = "esha1";
		String password = "Eshasherry1";
		String apiKey = "CN0JRMCZSQMHYGOSA42K20XNGZP4U54I";
		return false;
	}
	
	public ArrayList synchAllSurveys(){
		ApiSurveyDO[] surveys=Main.getSurveyList();
		for (int i = 0; i < surveys.length; i++) {
			Surveys survey=new Surveys();
			survey.setSurveyId(surveys[i].getSurveyId());
			survey.setName(surveys[i].getSurveyName());
			survey.setLastSynchTime(Utils.getTime());
			surveyServise.add(survey);
			System.out.println("Aashish ---------- "+survey.getId());
		}
		
		return null;
	}
}