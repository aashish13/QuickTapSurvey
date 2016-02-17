/**
 * 
 */
package com.quicktap.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicktap.data.dao.SurveyDao;
import com.quicktap.data.entity.Surveys;

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
}
