/**
 * 
 */
package com.quicktap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.quicktap.analysis.ChartsEnum;
import com.quicktap.model.ChartData;
import com.quicktap.model.CrossTabulationData;
import com.quicktap.service.VisualizationService;

/**
 * @author Aashish
 *
 */

@RestController
public class AnalysisRestController {
	@Autowired
	private VisualizationService visualizationService;

	@RequestMapping("getvisualizationdata/{chartText}/{questionId}")
	public ChartData show(@PathVariable int questionId, @PathVariable String chartText) {
		ChartsEnum chartType = ChartsEnum.valueOf(chartText);
		ChartData chartData = visualizationService.getChartData(questionId, chartType);
		return chartData;
	}
	@RequestMapping("getCrossTabulationData/{firstId}/{secondId}")
	public CrossTabulationData show(@PathVariable int firstId, @PathVariable int secondId) {
		CrossTabulationData crossTabulationData = visualizationService.getChartDataForCrossTabulation(firstId,secondId);
		return crossTabulationData;
	}

}