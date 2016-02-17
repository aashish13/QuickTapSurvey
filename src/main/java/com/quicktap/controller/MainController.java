/**
 * 
 */
package com.quicktap.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.quicktap.model.Login;

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
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login(Model model){
		return new ModelAndView("login","login",new Login());
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginValidate(@Valid Login login,BindingResult result){
		if(result.hasErrors())
			return "login";
		else{
			
			return "redirect:survey";
		}
				
	}
	
}
