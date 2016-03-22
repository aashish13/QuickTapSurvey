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

	public Map<String, Integer> getNPSValues(Integer questionId) {
		// TODO Auto-generated method stub

		
		SQLQuery detractorsQuery=
				sessionFactory.getCurrentSession().createSQLQuery("select count(value) from response_values where"
						+ " questions_id = "+questionId+" and value <=3;");
		
		SQLQuery passivesQuery=
				sessionFactory.getCurrentSession().createSQLQuery("select count(value) from response_values where"
						+ " questions_id = "+questionId+" and value >3 and value<=8;");
		
		SQLQuery promotersQuery=
				sessionFactory.getCurrentSession().createSQLQuery("select count(value) from response_values where"
						+ " questions_id = "+questionId+" and value>8;");
		
		Map<String, Integer> npsData = new HashMap<String, Integer>();
		npsData.put("detractors", Integer.parseInt(detractorsQuery.list().get(0).toString()));
		npsData.put("passives", Integer.parseInt(passivesQuery.list().get(0).toString()));
		npsData.put("promoters", Integer.parseInt(promotersQuery.list().get(0).toString()));
			
		
		return npsData;
	}
	


}
