package com.quicktap.analysis;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quicktap.data.entity.Questions;
import com.quicktap.data.entity.ResponseValues;
import com.quicktap.data.entity.Surveys;
import com.quicktap.model.ChartData;
import com.quicktap.service.QuestionService;
import com.quicktap.service.ResponseValueService;

@Component
public class QuotesAnalysis implements Analysis {

	@Autowired
	private QuestionService questionService;
	@Autowired
	private ResponseValueService responseValueService;
	@Autowired
	private ChartData chartData;

	@Override
	public ChartData getChartData(Integer questionId, ChartsEnum chart) {
		// TODO Auto-generated method stub
		Questions question = questionService.getById(questionId);
		chartData.setChartType(chart.getGoogleValue());
		chartData.setQuestion(question.getTitle());
		Surveys survey = question.getSurveys();
		Map column = new HashMap();
		for (ResponseValues rv : question.getResponseValueses()) {
			column.put(rv.getResponses().getDateCollected(), rv.getValue());
		}

		chartData.setRows(column);
		return chartData;
	}
}