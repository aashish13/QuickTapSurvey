/**
 * 
 */
package com.quicktap.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quicktap.data.entity.Questions;
import com.quicktap.data.entity.Responses;
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
	public ModelAndView showResponsesPage(HttpServletRequest request){
		//for a survey id, get the questions and responses. 
		int id=Integer.parseInt(request.getParameter("id"));
		//example for Ashwini

		Surveys survey=surveyService.getById(id);
			
		Set<Questions> questions =survey.getQuestionses(); 
		Set<Responses> responses = survey.getResponseses();
		
		ModelAndView responseMv = new ModelAndView("response");
		responseMv.addObject("responses", responses);
		responseMv.addObject("questions", questions);
		return responseMv;
		
	}
}
