/**
 * 
 */
package com.quicktap.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.quicktap.service.SyncService;

/**
 * @author Aashish
 *
 */
@Controller
public class SyncController {

	@Autowired
	private SyncService synchService;
	
	@RequestMapping(value="syncsurvey")
	public String synchSurveysFromServer(){
		synchService.synchSurveys("aashish");
		return "redirect:synchallresponse";
	}
	@RequestMapping(value="synchallresponse")
	public String synchAllResponsesFromServer(){
		String username="aashish";
		synchService.syncResponses("",username);
		return "redirect:survey";
	}
	@RequestMapping(value="syncresponse/{id}")
	public String synchSpecificResponsesFromServer(@PathVariable int id){
		String username="aashish";
		synchService.syncResponses(id,username);
		return "redirect:../survey";
	}
}
