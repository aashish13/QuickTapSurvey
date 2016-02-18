/**
 * 
 */
package com.quicktap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Aashish
 *
 */
@Controller
public class ResponsesController {
	@RequestMapping(value="/response")
	public ModelAndView showResponsesPage(){
		return new ModelAndView("response");
	}
}
