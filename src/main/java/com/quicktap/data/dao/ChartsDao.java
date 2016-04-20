/**
 * 
 */
package com.quicktap.data.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quicktap.data.entity.Charts;

/**
 * @author Aashish
 *
 */
@Transactional
@Repository
public class ChartsDao {
	@Autowired
    private SessionFactory sessionFactory;

	public Charts getChartByName(String chartName) {
		Criteria chartsCriteria=sessionFactory.getCurrentSession().createCriteria(Charts.class);
		List<Charts> charts=(List<Charts>) chartsCriteria.add(Restrictions.eq("name", chartName)).list();
		return charts.isEmpty()?null:charts.get(0);
	}

	/**
	 * @return
	 */
	public List<Charts> getAllCharts() {
		// TODO Auto-generated method stub
		return (ArrayList) sessionFactory.getCurrentSession().createQuery("From Charts").list();
	}

}
