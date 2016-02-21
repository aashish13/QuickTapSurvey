/**
 * 
 */
package com.quicktap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quicktap.data.entity.Surveys;
import com.quicktap.service.SurveyService;

/**
 * @author Aashish
 *
 */
@Controller
public class ResponsesController {
	@Autowired
	private SurveyService surveyService;
	
	@RequestMapping(value="/response")
	public ModelAndView showResponsesPage(){
		//example for Ashwini
		String username="";
		int survey_id=0;
		Surveys survey=surveyService.getById(survey_id);
		survey.getQuestionses();
		//Ends
		return new ModelAndView("response");
	}
}
