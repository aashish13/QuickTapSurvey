/**
 * 
 */
package com.quicktap.data.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quicktap.data.entity.ResponseValues;

/**
 * @author Aashish
 *
 */
@Repository
public class ResponseValueDao implements ParentDao{
	@Autowired
    private SessionFactory sessionFactory;

	/**
	 * @param rv
	 */
	public void save(ResponseValues rv) {
		sessionFactory.getCurrentSession().save(rv);
	}
}
