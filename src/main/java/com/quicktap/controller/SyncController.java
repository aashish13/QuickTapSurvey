/**
 * 
 */
package com.quicktap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quicktap.service.SyncService;

/**
 * @author Aashish
 *
 */
@Controller
public class SyncController {

	@Autowired
	private SyncService synchService;
	
	@RequestMapping(value="syncsurvey")
	public String synchSurveysFromServer(){
		//need to move this code to login controller method/class
		//synchService.loginQuickTap("aashish");
		//this method will get all the list of surveys
		//TODO: return type of this method should be generic to surveylist response
		synchService.synchSurveys("aashish");
		return "redirect:synchresponses";
	}
	@RequestMapping(value="synchresponses")
	public String synchResponsesFromSurver(){
		//we will get survey_id from the request 
		int survey_id=2;
		//we will get username from session
		String username="aashish";
		synchService.syncResponses(survey_id,username);
		return "redirect:survey";
	}
}
