/**
 * 
 */
package com.quicktap.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicktap.Utils;
import com.quicktap.data.dao.SurveyDao;
import com.quicktap.data.entity.Surveys;
import com.quicktap.integration.apihelper.Main;
import com.quicktap.integration.apihelper.data.ApiSurveyDO;

/**
 * @author Aashish
 *
 */
@Service
@Transactional
public class SurveyService{
	@Autowired
	private SurveyDao surveyDao;
	
	public int add(Surveys survey){
		return surveyDao.add(survey);
	}

	/**
	 * @param string
	 * @return
	 */
	public ArrayList getSurveyByUsername(String string) {
		return surveyDao.getSurveyByUsername(string);
	}

	/**
	 * @param surveyId
	 * @return
	 */
	public Surveys getById(int surveyId) {
		// TODO Auto-generated method stub
		return surveyDao.getById(surveyId);
	}

	/**
	 * @param username
	 */
	public void synchSurveys(String username) {
		ApiSurveyDO[] surveys=Main.getSurveyList(username);
		
		for (ApiSurveyDO s : surveys) {
			Surveys survey=new Surveys();
			survey.setSurveyId(s.getSurveyId());
			survey.setName(s.getSurveyName());
			survey.setTotalResponses(s.getTotalResponses());
			survey.setLastSynchTime(Utils.getTime());
			if(getById(s.getSurveyId())==null)
				add(survey);
		}
		
	}
}
