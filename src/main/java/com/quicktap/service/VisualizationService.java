/**
 * 
 */
package com.quicktap.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.map.MultiValueMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicktap.Utils;
import com.quicktap.data.entity.Questions;
import com.quicktap.data.entity.ResponseValues;
import com.quicktap.data.entity.Responses;
import com.quicktap.data.entity.Surveys;
import com.quicktap.model.ChartData;

import jersey.repackaged.com.google.common.collect.Multimap;

/**
 * @author Aashish
 *
 */
@Service
public class VisualizationService {
	@Autowired
	private SurveyService surveyService;
	@Autowired
	private QuestionService questionService;
	@Autowired
	private ResponseValueService responseValueService;
	@Autowired
	private ResponseService responseService;

	public ChartData getChartData(int questionId, String chart) {
		ChartData data = new ChartData();
		Questions question = questionService.getById(questionId);
		data.setChartType(chart);
		if(chart.equalsIgnoreCase("geochart")){
			Map<String,String> columns = new HashMap<String,String>();
			columns.put("number", "Lat");
			columns.put("number", "Lon");
			data.setColumns(columns);
			Map<Float,Float> rows = responseService.getLatitudeAndLongitude(questionId);
			data.setRows(rows);
		}
		else{
			data.setQuestion(Utils.getOnlyTitle(question.getTitle()));
			Map columns = new LinkedHashMap();
			columns.put("string", "Gender");
			columns.put("number", "Total");
			data.setColumns(columns);
			Map rows = responseValueService.getResponseWithCount(questionId);
			data.setRows(rows);
		}
		
		

		return data;
	}

}
