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

import com.quicktap.data.entity.Responses;

/**
 * @author Aashish
 *
 */
@Repository
public class ResponseDao implements ParentDao {
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
}
