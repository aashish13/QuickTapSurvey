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
		float promoters=npsValue.get("promoters");
		float detractors=npsValue.get("detractors");
		float passives=npsValue.get("passives");
		float respondents=promoters+detractors+passives;
		float promotersPercent = ((promoters/respondents)*100);
		float detractorsPercent = ((detractors/respondents)*100);
        int nps = (int) (promotersPercent - detractorsPercent);
		//npsValue.put("NPS", nps);
        Map returnValue=new HashMap();
        returnValue.put("NPS", nps);
		return returnValue;
	}

}
