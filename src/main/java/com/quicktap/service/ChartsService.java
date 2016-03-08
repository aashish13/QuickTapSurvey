/**
 * 
 */
package com.quicktap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicktap.data.dao.ChartsDao;
import com.quicktap.data.entity.Charts;

/**
 * @author Aashish
 *
 */
@Service
public class ChartsService{
	@Autowired
	private ChartsDao chartsDao;
	
	public Charts getChartByName(String chartName) {
		Charts chart=chartsDao.getChartByName(chartName);
		return chart;
	}

}
