/**
 * 
 */
package com.quicktap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quicktap.data.entity.Charts;
import com.quicktap.service.ChartsService;

/**
 * @author Aashish
 *
 */
@Controller
public class ReportsController {
	@Autowired private ChartsService chartsService;
	@RequestMapping(value="/charts/{surveyId}")
	public ModelAndView showReportsDefaultPage(@PathVariable int surveyId){
		List<Charts> chartsList=chartsService.getAllCharts();
		ModelAndView mv=new ModelAndView("charts");
		mv.addObject("surveyId",surveyId);
		mv.addObject("chartsList",chartsList);
		return mv;
	}
	
	
}
