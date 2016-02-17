/**
 * 
 */
package com.quicktap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Aashish
 *
 */
@Controller
public class MainController {

	@RequestMapping(value="/")
	public String showWelcome()
	{
		return "welcome";
	}
	@RequestMapping(value="/login")
	public String login(Model model){
		return "login";
	}
	
}
