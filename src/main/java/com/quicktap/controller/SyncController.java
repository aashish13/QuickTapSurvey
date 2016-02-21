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
	
	@RequestMapping(value="sync")
	public String synchFromServer(){
		//need to move this code to login controller method/class
		synchService.loginQuickTap("aashish");
		//this method will get all the list of surveys
		//TODO: return type of this method should be generic to surveylist response
		synchService.synchSurveys("aashish");
		return "redirect:survey";
	}
}
