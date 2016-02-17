/**
 * 
 */
package com.quicktap.data.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quicktap.data.entity.Surveys;

/**
 * @author Aashish
 *
 */
@Repository
public class SurveyDao implements ParentDao{
	@Autowired
    private SessionFactory sessionFactory;
	
	public int add(Surveys survey) {
		Session session=sessionFactory.getCurrentSession();
		session.save(survey);
		return survey.getId();
	}

	/**
	 * @param string
	 * @return
	 */
	public ArrayList getSurveyByUsername(String string) {
		Session session=sessionFactory.getCurrentSession();
		return (ArrayList) session.createQuery("From Surveys").list();
	}

	/**
	 * @param surveyId
	 * @return
	 */
	public Surveys getById(int surveyId) {
		Session session=sessionFactory.getCurrentSession();
		List list=session.createQuery("From Surveys where surveyId="+surveyId).list();
		return list.isEmpty()?null:(Surveys)list.get(0);
	}
	
	
}
