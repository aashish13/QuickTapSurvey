/**
 * 
 */
package com.quicktap.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicktap.data.dao.QuestionDao;
import com.quicktap.data.entity.Questions;

/**
 * @author Aashish
 *
 */
@Service
public class QuestionService{
	@Autowired
	private QuestionDao questionDao;
	
	/**
	 * @param question
	 */
	public void save(Questions question) {
		questionDao.save(question);
	}

	/**
	 * @param surveyId
	 * @param questionNo
	 * @return
	 */
	public Questions getByQuestionNumberAndSurveyId(int surveyId, long questionNo) {
		
		return questionDao.getByQuestionNumberAndSurveyId(surveyId,questionNo);
	}

}
