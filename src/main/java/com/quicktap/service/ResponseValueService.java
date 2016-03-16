/**
 * 
 */
package com.quicktap.service;

import java.util.Map;

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
	private ResponseValueDao responseValueDao;
	/**
	 * @param rv
	 */
	public void save(ResponseValues rv) {
		responseValueDao.save(rv);
		
	}
	public Map getResponseWithCount(int questionId) {
		// TODO Auto-generated method stub
		return responseValueDao.getResponseValueWithCount(questionId);
	}

}
