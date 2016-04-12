/**
 * 
 */
package com.quicktap.analysis;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quicktap.Utils;
import com.quicktap.data.entity.Questions;
import com.quicktap.model.ChartData;
import com.quicktap.model.OpenChartData;
import com.quicktap.service.QuestionService;
import com.quicktap.service.ResponseValueService;

/**
 * @author Aashish
 *
 */
@Component
public class OpenTextAnalysis implements Analysis {

	@Autowired
	private QuestionService questionService;
	@Autowired
	private ResponseValueService responseValueService;
	@Autowired
	private OpenChartData chartData;
	
	@Override
	public ChartData getChartData(Integer questionId, ChartsEnum chart) {
		Questions question = questionService.getById(questionId);
		chartData.setChartType(chart.getGoogleValue());
		chartData.setQuestion(Utils.getOnlyTitle(question.getTitle()));
		
		Map columns=new HashMap<String,String>();
		columns.put("string", "Text");
		chartData.setColumns(columns);
		chartData.setOpenText(responseValueService.getValueList(questionId));
		
		return chartData;
	}

}
