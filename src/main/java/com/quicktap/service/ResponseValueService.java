/**
 * 
 */
package com.quicktap.service;

import java.util.HashMap;
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
	public Map getGaugeCalculation(Integer questionId) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> npsValue=responseValueDao.getNPSValues(questionId);
		Integer promoters=npsValue.get("promoters");
		Integer detractors=npsValue.get("detractors");
		Integer passives=npsValue.get("passives");
		Integer respondents=promoters+detractors+passives;
        float nps = (float) ((promoters - detractors)/(respondents)*100);
		//npsValue.put("NPS", nps);
        Map returnValue=new HashMap();
        returnValue.put("NPS", nps);
		return returnValue;
	}

}
