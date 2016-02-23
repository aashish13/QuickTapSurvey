/**
 * 
 */
package com.quicktap.data.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quicktap.data.entity.Questions;

/**
 * @author Aashish
 *
 */
@Repository
public class QuestionDao implements ParentDao {
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
}
