/**
 * 
 */
package com.quicktap.data.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.SqlQuery;
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
		SQLQuery sqlQuery = sessionFactory.getCurrentSession().createSQLQuery("select value,count(*) "
				+ "from response_values " + "where questions_id = " + questionId + " group by value");

		List list = sqlQuery.list();
		Map returnValue = new HashMap();
		for (Object object : list) {
			Object[] o = (Object[]) object;
			Integer count = Integer.valueOf((o[1]).toString());
			String value = (o[0]).toString();
			returnValue.put(o[0], o[1]);
		}
		return returnValue;
	}

	public Map<String, Integer> getNPSValues(Integer questionId) {
		// TODO Auto-generated method stub

		SQLQuery detractorsQuery = sessionFactory.getCurrentSession().createSQLQuery(
				"select count(value) from response_values where" + " questions_id = " + questionId + " and value <=6;");

		SQLQuery passivesQuery = sessionFactory.getCurrentSession()
				.createSQLQuery("select count(value) from response_values where" + " questions_id = " + questionId
						+ " and value >=7 and value<=8;");

		SQLQuery promotersQuery = sessionFactory.getCurrentSession().createSQLQuery(
				"select count(value) from response_values where" + " questions_id = " + questionId + " and value>8;");

		Map<String, Integer> npsData = new HashMap<String, Integer>();
		npsData.put("detractors", Integer.parseInt(detractorsQuery.list().get(0).toString()));
		npsData.put("passives", Integer.parseInt(passivesQuery.list().get(0).toString()));
		npsData.put("promoters", Integer.parseInt(promotersQuery.list().get(0).toString()));

		return npsData;
	}

	/**
	 * @param questionId
	 * @return
	 */
	public List getValueList(Integer questionId) {
		SQLQuery sqlQuery = sessionFactory.getCurrentSession()
				.createSQLQuery("select value from response_values where questions_id=:question_id");
		sqlQuery.setParameter("question_id", questionId);
		return sqlQuery.list();
	}

	/**
	 * @param firstId
	 * @param secondId
	 * @return
	 */
	public List getDataForCrossTabulation(Integer firstId, Integer secondId) {
		String sqlQueryString = "";

		SQLQuery sqlQuery = sessionFactory.getCurrentSession().createSQLQuery("select r1.value 'v1', r2.value 'v2', count(*) from response_values r1, response_values r2 where r1.questions_id="+firstId+" and r2.questions_id="+secondId+"  group by r2.value, r1.value with rollup ");
		//sqlQuery.setParameter("firstId", firstId);
		//sqlQuery.setParameter("secondId", secondId);

		return sqlQuery.list();

	}

}
