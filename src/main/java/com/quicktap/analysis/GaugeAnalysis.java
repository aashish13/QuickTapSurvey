/**
 * 
 */
package com.quicktap.analysis;

import org.springframework.stereotype.Component;

import com.quicktap.model.ChartData;

/**
 * @author Aashish
 *
 */
@Component
public class GaugeAnalysis implements Analysis {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.quicktap.analysis.Analysis#getChartData(java.lang.Integer,
	 * java.lang.String)
	 */
	@Override
	public ChartData getChartData(Integer questionId, ChartsEnum chart) {
		// TODO For Ashwini Write code here for gauge chart refer CoreAnalysis.getchartData method you may have 
		// to create a new class in com.model extending ChartData class and change javascript 
		// auto call method in visualize.js  
		return null;
	}

}
