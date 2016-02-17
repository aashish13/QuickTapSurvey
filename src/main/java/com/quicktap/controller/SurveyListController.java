/**
 * 
 */
package com.quicktap.controller;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quicktap.integration.apihelper.Main;
import com.quicktap.integration.apihelper.data.ApiSurveyDO;
import com.quicktap.service.SyncService;

/**
 * @author Aashish
 *
 */
@Controller
public class SurveyListController {
	
	@Autowired
	private SyncService synchService;
	
	@RequestMapping(value="survey")
	public String showSurveyList(){
		return "survey";
	}
	
	@RequestMapping(value="sync")
	public String synchFromServer(){
		//need to move this code to login controller method/class
		synchService.loginQuickTap("esha");
		//this method will get all the list of surveys
		//TODO: return type of this method should be generic to surveylist response
		synchService.synchAllSurveys();
		
		return "redirect:survey";
	}
}