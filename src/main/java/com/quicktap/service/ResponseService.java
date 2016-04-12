/**
 * 
 */
package com.quicktap.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	/**
	 * @param questionId
	 * @return
	 */
	public Map<Float,Float> getLatitudeAndLongitude(int surveyId) {
		List<Responses> responseList=responseDao.getLatitudeAndLongitude(surveyId);
		Map<Float,Float> location=new HashMap<Float,Float>();
		for (Responses response: responseList) {
			if(response.getLatitude()!=0)
			location.put(response.getLatitude(), response.getLongitude());
		}
		return location;
	}

	/**
	 * @param questionId
	 * @return
	 */
	public Map<String, Integer> getRegionFromLatitudeAndLongitude(Integer questionId) {
		Map<String,Integer> chartValues= new HashMap<String,Integer>();
		chartValues.put("Ontario", 1000);
		chartValues.put("Quebec", 1900);
		chartValues.put("British Columbia", 100);
		chartValues.put("Alberta", 300);
		chartValues.put("Manitoba", 500);
		chartValues.put("Saskatchewan", 600);
		chartValues.put("Nova Scoitia", 30);
		chartValues.put("New Brunswick", 50);
		chartValues.put("Newfoundland and Labrador", 100);
		chartValues.put("Prince Edward Island", 200);
		chartValues.put("Northwest Territories", 300);
		chartValues.put("Yukon", 400);
		chartValues.put("Nunavut", 500);
		return chartValues;
	}
	
	
	

}
