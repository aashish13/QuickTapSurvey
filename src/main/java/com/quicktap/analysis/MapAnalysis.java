/**
 * 
 */
package com.quicktap.analysis;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quicktap.data.entity.Questions;
import com.quicktap.data.entity.Surveys;
import com.quicktap.model.ChartData;
import com.quicktap.service.QuestionService;
import com.quicktap.service.ResponseService;
import com.quicktap.service.SurveyService;

/**
 * @author Aashish
 *
 */
@Component
public class MapAnalysis implements Analysis {
	@Autowired
	private SurveyService surveyService;
	@Autowired
	private ResponseService responseService;
	@Autowired
	private ChartData chartData;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.quicktap.analysis.Analysis#getChartData(java.lang.Integer,
	 * java.lang.String)
	 */
	@Override
	public ChartData getChartData(Integer surveyId, ChartsEnum chart) {
		Surveys survey = surveyService.getById(surveyId);
		chartData.setChartType(chart.getGoogleValue());
		chartData.setQuestion(survey.getName());
		Map<String, String> columns = new HashMap<String, String>();
		columns.put("number", "Lat");
		columns.put("number", "Lon");
		chartData.setColumns(columns);
		Map<Float, Float> rows = responseService.getLatitudeAndLongitude(surveyId);
		chartData.setRows(rows);
		return chartData;
	}

}
