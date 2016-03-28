/**
 * 
 */
package com.quicktap.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quicktap.service.QuestionService;

/**
 * @author Aashish
 *
 */
@Controller
public class VisualizationController {
	@Autowired
	private QuestionService questionService;

	@RequestMapping(value = "visualize/{chart}/{surveyId}")
	public ModelAndView showCharts(@PathVariable int surveyId, @PathVariable String chart) {
		Map<Integer, String> questions = questionService.getQuestionsForVisualizationDropDown(chart, surveyId);
		ModelAndView mv = new ModelAndView("visualize");
		mv.addObject("questions", questions);
		mv.addObject("chartType", chart);
		// mv.addObject("data",data);
		return mv;
	}
}
