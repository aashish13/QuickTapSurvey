/**
 * 
 */
package com.quicktap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicktap.data.dao.SurveyUserLinkDao;
import com.quicktap.data.entity.SurveyUserLinks;

/**
 * @author Aashish
 *
 */
@Service
public class SurveyUserLinkService{
	
	@Autowired
	private SurveyUserLinkDao surveyUserLinkDao;
	/**
	 * @param surveyUserLink
	 */
	public void save(SurveyUserLinks surveyUserLink) {
		surveyUserLinkDao.save(surveyUserLink);
		
	}

}
