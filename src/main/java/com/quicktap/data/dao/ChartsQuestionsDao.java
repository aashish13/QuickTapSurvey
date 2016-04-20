/**
 * 
 */
package com.quicktap.data.dao;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quicktap.data.entity.ChartsQuestions;

/**
 * @author Aashish
 *
 */
@Transactional
@Repository
public class ChartsQuestionsDao {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * @param id
	 * @return
	 */
	public ChartsQuestions getById(Integer id) {
		ChartsQuestions chartsQuestions = sessionFactory.getCurrentSession().get(ChartsQuestions.class, id);
		return chartsQuestions;
	}

	/**
	 * @param id
	 * @return
	 */
	public ChartsQuestions getByQuestionId(Integer id) {
		Criteria criteria=sessionFactory.getCurrentSession().createCriteria(ChartsQuestions.class);
		criteria.add(Restrictions.eq("questionTypes.id", id));
		return criteria.list().size()<1?null:(ChartsQuestions) criteria.list().get(0);
	}

}