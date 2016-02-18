/**
 * 
 */
package com.quicktap.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.support.FormatterPropertyEditorAdapter;
import org.springframework.stereotype.Component;

import com.quicktap.Utils;
import com.quicktap.data.dao.SurveyDao;
import com.quicktap.data.entity.Surveys;
import com.quicktap.integration.apihelper.Main;
import com.quicktap.integration.apihelper.data.ApiSurveyDO;

/**
 * @author Aashish
 *
 */
@Component
public class SyncService {
	
	@Autowired
	private SurveyService surveyService;
	
	public boolean loginQuickTap(String username){
		return false;
	}
	
	public void synchSurveys(String username){
		//TODO directly using the method from main need to implement with jersey
		surveyService.synchSurveys(username);
	}
}