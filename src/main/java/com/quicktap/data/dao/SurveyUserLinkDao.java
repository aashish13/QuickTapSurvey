/**
 * 
 */
package com.quicktap.data.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quicktap.data.entity.SurveyUserLinks;
import com.quicktap.data.entity.Users;

/**
 * @author Aashish
 *
 */
@Transactional
@Repository
public class SurveyUserLinkDao {
	@Autowired
    private SessionFactory sessionFactory;

	/**
	 * @param surveyUserLink
	 */
	public void save(SurveyUserLinks surveyUserLink) {

		sessionFactory.getCurrentSession().saveOrUpdate(surveyUserLink);
	}
	
	@SuppressWarnings("unchecked")
	public SurveyUserLinks getSurveyLinkBySurveyId(int id) {
		Criteria userCriteria=sessionFactory.getCurrentSession().createCriteria(Users.class);
		//List<Users> list=(List<Users>) userCriteria.add(Restrictions.eq("username", username)).list();
		//return list.isEmpty()?null:list.get(0);
		return null;
	}
}
