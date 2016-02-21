/**
 * 
 */
package com.quicktap.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicktap.data.dao.ResponseDao;
import com.quicktap.data.entity.Responses;

/**
 * @author Aashish
 *
 */
@Service
public class ResponseService{

	@Autowired
	private ResponseDao responseDao;
	
	/**
	 * @param rUsername
	 * @param dateCollected
	 * @return
	 */
	public Responses getResponseByUsernameAndDateCollected(String rUsername, String dateCollected) {
		return responseDao.getResponseByUsernameAndDateCollected(rUsername,dateCollected);
	}

	/**
	 * @param r
	 */
	public void save(Responses response) {
		responseDao.save(response);
		
	}

}
