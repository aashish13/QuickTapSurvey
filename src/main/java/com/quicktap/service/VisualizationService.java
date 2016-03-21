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
import com.quicktap.analysis.Analysis;
import com.quicktap.analysis.AnalysisFactory;
import com.quicktap.analysis.ChartsEnum;
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
	private ResponseService responseService;
	@Autowired
	private AnalysisFactory analysisFactory;

	public ChartData getChartData(int questionId, ChartsEnum chartType) {
		Analysis analysisClass=analysisFactory.getAnalysisClass(chartType);
		ChartData chartData=analysisClass.getChartData(questionId, chartType);
		return chartData;
	}

}
