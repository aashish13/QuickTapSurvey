/**
 * 
 */
package com.quicktap.analysis;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quicktap.data.entity.Questions;
import com.quicktap.model.ChartData;
import com.quicktap.service.QuestionService;
import com.quicktap.service.ResponseService;

/**
 * @author Aashish
 *
 */
@Component
public class GeoChartAnalysis implements Analysis {
	@Autowired
	private QuestionService questionService;
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
	public ChartData getChartData(Integer questionId, ChartsEnum chart) {
		Questions question = questionService.getById(questionId);
		chartData.setChartType(chart.getGoogleValue());
		Map<String, String> columns = new LinkedHashMap<String, String>();
		columns.put("string", "Provinces");
		columns.put("number", "Count");
		chartData.setColumns(columns);
		//Map<Float, Float> rows = responseService.getLatitudeAndLongitude(questionId);
		Map<String, Integer> rows = responseService.getRegionFromLatitudeAndLongitude(questionId);
		chartData.setRows(rows);
		return chartData;
	}
	

}
