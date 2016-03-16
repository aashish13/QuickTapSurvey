/**
 * 
 */
package com.quicktap.data.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quicktap.data.entity.ResponseValues;

/**
 * @author Aashish
 *
 */
@Transactional
@Repository
public class ResponseValueDao {
	@Autowired
    private SessionFactory sessionFactory;

	/**
	 * @param rv
	 */
	public void save(ResponseValues rv) {
		sessionFactory.getCurrentSession().save(rv);
	}

	public Map<String, Integer> getResponseValueWithCount(int questionId) {
		SQLQuery sqlQuery=
				sessionFactory.getCurrentSession().createSQLQuery("select value,count(*) "
						+ "from response_values "
						+ "where questions_id = "+questionId+" group by value");
		
		List list=sqlQuery.list();
		Map returnValue=new HashMap();
		for (Object object : list) {
			Object[] o=(Object[]) object;
			Integer count=Integer.valueOf((o[1]).toString()) ;
			String value=(o[0]).toString();
			returnValue.put(o[0], o[1]);
		}
		return returnValue;
	}

}
