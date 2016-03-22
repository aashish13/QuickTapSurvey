/**
 * 
 */
package com.quicktap.analysis;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quicktap.Utils;
import com.quicktap.data.entity.Questions;
import com.quicktap.model.ChartData;
import com.quicktap.service.QuestionService;
import com.quicktap.service.ResponseValueService;

/**
 * @author Aashish
 *
 */
@Component
public class GaugeAnalysis implements Analysis {

	@Autowired
	private QuestionService questionService;
	@Autowired
	private ResponseValueService responseValueService;
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
		chartData.setChartType(chart);

		chartData.setQuestion(Utils.getOnlyTitle(question.getTitle()));
		Map columns = new LinkedHashMap();
		columns.put("string", "Gender");
		columns.put("number", "Total");
		chartData.setColumns(columns);
		Map rows = responseValueService.getGaugeCalculation(questionId);
		chartData.setRows(rows);

		return chartData;
	}

}
