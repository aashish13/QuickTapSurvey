/**
 * 
 */
package com.quicktap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Aashish
 *
 */
@Controller
public class ReportsController {
	@RequestMapping(value="/charts/{surveyId}")
	public ModelAndView showReportsDefaultPage(@PathVariable int surveyId){
		ModelAndView mv=new ModelAndView("charts");
		mv.addObject("surveyId",surveyId);
		return mv;
	}
	
	
}
