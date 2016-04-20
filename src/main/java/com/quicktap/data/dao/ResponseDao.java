/**
 * 
 */
package com.quicktap.data.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quicktap.data.entity.Responses;

/**
 * @author Aashish
 *
 */
@Transactional
@Repository
public class ResponseDao{
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * @param rUsername
	 * @param dateCollected
	 * @return
	 */
	public Responses getResponseByUsernameAndDateCollected(String rUsername, String dateCollected) {
		Criteria responseCriteria = sessionFactory.getCurrentSession().createCriteria(Responses.class);
		List<Responses> responseList = responseCriteria.add(Restrictions.eq("userName", rUsername))
				.add(Restrictions.eq("dateCollected", dateCollected)).list();
		return responseList.isEmpty() ? null : responseList.get(0);
	}

	/**
	 * @param response
	 */
	public void save(Responses response) {
		sessionFactory.getCurrentSession().saveOrUpdate(response);
	}
	/**
	 * @param surveyId
	 */
	public List<Responses> getLatitudeAndLongitude(int surveyId) {
		Criteria criteria=sessionFactory.getCurrentSession().createCriteria(Responses.class);
		criteria.add(Restrictions.eq("surveys.id", surveyId));
		List<Responses> responseList=criteria.list();
		return responseList;
	}
}
