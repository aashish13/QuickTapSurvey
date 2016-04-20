/**
 * 
 */
package com.quicktap.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicktap.Utils;
import com.quicktap.data.dao.ChartsDao;
import com.quicktap.data.entity.Charts;
import com.quicktap.data.entity.ChartsQuestions;
import com.quicktap.data.entity.Surveys;

/**
 * @author Aashish
 *
 */
@Service
public class ChartsService{
	@Autowired
	private ChartsDao chartsDao;
	@Autowired private SurveyService surveyService;
	@Autowired private ChartsQuestionsService chartQuestionsService;
	
	public Charts getChartByName(String chartName) {
		Charts chart=chartsDao.getChartByName(chartName);
		return chart;
	}

	/**
	 * @return
	 */
	public Set<Charts> getAllChartsForSurvey(Integer surveyID) {
		//TODO Get all the question of this survey
		//get the question type id from the title of the question
		//now that we have all the question types for this 
		//survey check which all chart type are valid for these question type ids
		Set<Charts> charts=new HashSet<>();
		Surveys survey=surveyService.getById(surveyID);
		Set<Integer> questionTypeIds=Utils.getQuestionTypeListFromSurvey(survey.getQuestionses());
		for (Integer id : questionTypeIds) {
			ChartsQuestions chartQuestions=chartQuestionsService.getByQuestionId(id);
			if(chartQuestions!=null)
				charts.add(chartQuestions.getCharts());
		}
		return charts;
	}
	public List<Charts> getAllCharts(){
		return chartsDao.getAllCharts();
	}

}
