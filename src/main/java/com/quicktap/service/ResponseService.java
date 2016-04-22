/**
 * 
 */
package com.quicktap.service;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicktap.data.dao.ResponseDao;
import com.quicktap.data.entity.Responses;
import com.quicktap.integration.geo.ReverseGeoEncoding;

/**
 * @author Aashish
 *
 */
@Service
public class ResponseService{

	@Autowired
	private ResponseDao responseDao;
	
	
	/**
	 * 
	 */
	public ResponseService() {
		// TODO Auto-generated constructor stub
	}
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
		
		Map<String,Integer> provinceCounts=new HashMap<>();
		
		provinceCounts.put("Yukon", 0);
		provinceCounts.put("Northwest Territories", 0);
		provinceCounts.put("Nunavut", 0);
		provinceCounts.put("Prince Edward Island", 0);
		provinceCounts.put("Newfoundland and Labrador", 0);
		provinceCounts.put("New Brunswick", 0);
		provinceCounts.put("Nova Scoitia", 0);
		provinceCounts.put("Saskatchewan", 0);
		provinceCounts.put("Manitoba", 0);
		provinceCounts.put("Ontario", 0);
		provinceCounts.put("Quebec", 0);
		provinceCounts.put("British Columbia", 0);
		provinceCounts.put("Alberta", 0);
		 
		Map<Float, Float> rows = getLatitudeAndLongitude(questionId);

		for (Map.Entry<Float, Float> entry: rows.entrySet()) {
			String province=new ReverseGeoEncoding().getProvince(entry.getKey(), entry.getValue(), "CA");
			if(province!=null)
				provinceCounts.put(province, (provinceCounts.get(province)+1));
		}
		return provinceCounts;
	}
	
	
	

}
