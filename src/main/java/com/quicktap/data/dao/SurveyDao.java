/**
 * 
 */
package com.quicktap.data.dao;

import javax.transaction.Transactional;

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
}
