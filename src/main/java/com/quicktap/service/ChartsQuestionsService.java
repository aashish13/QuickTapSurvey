/**
 * 
 */
package com.quicktap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quicktap.data.dao.ChartsQuestionsDao;
import com.quicktap.data.entity.ChartsQuestions;

/**
 * @author Aashish
 *
 */
@Service
@Transactional
public class ChartsQuestionsService{
	
	@Autowired private ChartsQuestionsDao chartQuestionsDao;
	public ChartsQuestions getById(Integer id) {
		return chartQuestionsDao.getById(id);
	}
	/**
	 * @param id
	 * @return
	 */
	public ChartsQuestions getByQuestionId(Integer id) {
		
		return chartQuestionsDao.getByQuestionId(id);
	}
}