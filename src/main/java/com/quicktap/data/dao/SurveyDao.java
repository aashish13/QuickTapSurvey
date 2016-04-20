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
import org.springframework.transaction.annotation.Transactional;

import com.quicktap.data.entity.Surveys;

/**
 * @author Aashish
 *
 */
@Transactional
@Repository
public class SurveyDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	
	public void save(Surveys survey) {
		sessionFactory.getCurrentSession().saveOrUpdate(survey);
	}
	
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
	public Surveys getBySurveyId(int surveyId) {
		Session session=sessionFactory.getCurrentSession();
		List list=session.createQuery("From Surveys where surveyId="+surveyId).list();
		return list.isEmpty()?null:(Surveys)list.get(0);
	}

	/**
	 * @param id
	 * @return
	 */
	public Surveys getById(int id) {
		Surveys survey=sessionFactory.getCurrentSession().get(Surveys.class, id);
		return survey;
	}

	/**
	 * @param survey
	 */
	public void delete(Surveys survey) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(survey);
	}
	
	
}
