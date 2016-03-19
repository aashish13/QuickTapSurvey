/**
 * 
 */
package com.quicktap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.quicktap.model.ChartData;
import com.quicktap.service.VisualizationService;

/**
 * @author Aashish
 *
 */

@RestController
public class AnalysisRestController {
	@Autowired
	private VisualizationService visualizationService;
	
	@RequestMapping("getvisualizationdata/{chartType}/{questionId}")
	public ChartData show(@PathVariable int questionId,@PathVariable String chartType){
		ChartData chartData=visualizationService.getChartData(questionId, chartType);
		return chartData;
	}
	
	
	
}