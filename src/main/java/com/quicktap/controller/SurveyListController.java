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

/**
 * @author Aashish
 *
 */
@Controller
public class SurveyListController {
	
	@Autowired
	private SurveyService surveyService;
	
	@RequestMapping(value="survey")
	public String showSurveyList(Model model){
		ArrayList listSurvey=surveyService.getSurveyByUsername("aashish");
		model.addAttribute("surveys",listSurvey);
		return "survey";
	}
	
	
}