/**
 * 
 */
package com.quicktap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Aashish
 *
 */
@Controller
public class SurveyListController {
	@RequestMapping(value="survey")
	public String showSurveyList(){
		return "survey";
	}
	
	@RequestMapping(value="sync")
	public String synchFromServer(){
		System.out.println("This is a test to see if we are getting the control to method synch in controller or not");
		return "redirect:survey";
	}
	
}
