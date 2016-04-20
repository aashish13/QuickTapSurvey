/**
 * 
 */
package com.quicktap.data.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quicktap.data.entity.Questions;
import com.quicktap.data.entity.Surveys;

/**
 * @author Aashish
 *
 */
@Transactional
@Repository
public class QuestionDao  {
	@Autowired
    private SessionFactory sessionFactory;

	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	/**
	 * @param question
	 */
	public void save(Questions question) {
		getSession().saveOrUpdate(question);
	}

	/**
	 * @param surveyId
	 * @param questionNo
	 * @return 
	 */
	public Questions getByQuestionNumberAndSurveyId(int surveyId, long questionNo) {
		List<Questions> questions= getSession().createCriteria(Questions.class)
				.add(Restrictions.eq("surveys.id", surveyId))
				.add(Restrictions.eq("questionNo", questionNo))
				.list();
		return questions.size()>0?questions.get(0):null;
	}

	public Questions getById(int questionId) {
		Questions question=sessionFactory.getCurrentSession().get(Questions.class, questionId);
		return question;
	}

	/**
	 * @param surveyId
	 * @return
	 */
	public List<Questions> getBySurveyId(int surveyId) {
		Criteria criteria=sessionFactory.getCurrentSession().createCriteria(Questions.class);
		criteria.add(Restrictions.eq("surveys.id", surveyId));
		return criteria.list();
	}
}
