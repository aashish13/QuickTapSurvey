/**
 * 
 */
package com.quicktap.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicktap.Utils;
import com.quicktap.data.entity.Questions;
import com.quicktap.data.entity.ResponseValues;
import com.quicktap.data.entity.Responses;
import com.quicktap.data.entity.Surveys;
import com.quicktap.model.ChartData;

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

	public Map<String, Integer> getDataFor(int id, int questionType) {
		Surveys survey = surveyService.getById(id);
		Set<Responses> responses = survey.getResponseses();
		Map<String, Integer> data = new HashMap<String, Integer>();
		Integer female = 0, male = 0;

		for (Responses response : responses) {
			for (ResponseValues rv : response.getResponseValueses()) {
				if (rv.getValue().equalsIgnoreCase("Male"))
					male++;
				else if (rv.getValue().equalsIgnoreCase("Female"))
					female++;

			}
		}
		//data.put("Male", male);
		//data.put("Female", female);
		data.put("Mumbai", 234);
		data.put("Delhi", 334);
		data.put("Pune", 112);
		data.put("Kolhapur", 12);
		data.put("Nagpur", 456);
		data.put("Goa", 99);
		data.put("Banglore", 567);
		return data;
	}

	public ChartData getChartData(int questionId, String chart) {
		Questions question = questionService.getById(questionId);
		
		
		ChartData data = new ChartData();
		data.setChartType(chart);
		data.setQuestion(Utils.getOnlyTitle(question.getTitle()));
		
		// Analysis starts here
		Map<String, String> columns = new LinkedHashMap<String, String>();
		columns.put("string", "Gender");
		columns.put("number", "Total");
		data.setColumns(columns);
		Map<String, Integer> rows = responseValueService.getResponseWithCount(questionId);
		
		data.setRows(rows);

		return data;
	}

}
