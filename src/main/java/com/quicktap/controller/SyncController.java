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
		return "redirect:synchresponse";
	}
	@RequestMapping(value="synchresponse")
	public String synchResponsesFromServer(){
		//HttpServletResponse response,@PathVariable int surveyId,@PathVariable String sync
		String username="aashish";
		/*if(sync.equalsIgnoreCase("all")){
			synchService.syncResponses(sync,username);
		}	
		else{*/
		int surveyId=11;
			synchService.syncResponses("",username);
		//}	
		return "redirect:survey";
	}
}
