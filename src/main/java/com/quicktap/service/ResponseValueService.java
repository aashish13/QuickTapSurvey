/**
 * 
 */
package com.quicktap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicktap.data.dao.ResponseValueDao;
import com.quicktap.data.entity.ResponseValues;

/**
 * @author Aashish
 *
 */
@Service
public class ResponseValueService {
	@Autowired
	private ResponseValueDao responseVaalueDao;
	/**
	 * @param rv
	 */
	public void save(ResponseValues rv) {
		responseVaalueDao.save(rv);
		
	}

}
