/**
 * 
 */
package com.quicktap.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quicktap.service.SurveyService;
import com.quicktap.service.SyncService;

/**
 * @author Aashish
 *
 */
@Controller
public class SurveyListController {
	
	@Autowired
	private SyncService synchService;
	
	@Autowired
	private SurveyService surveyService;
	
	@RequestMapping(value="survey")
	public String showSurveyList(Model model){
		ArrayList listSurvey=surveyService.getSurveyByUsername("esha");
		model.addAttribute("surveys",listSurvey);
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