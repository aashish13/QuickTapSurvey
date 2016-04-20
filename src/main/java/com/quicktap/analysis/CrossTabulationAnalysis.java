/**
 * 
 */
package com.quicktap.analysis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quicktap.model.ChartData;
import com.quicktap.model.CrossTabulationData;
import com.quicktap.service.ResponseValueService;

/**
 * @author Aashish
 *
 */
@Component
public class CrossTabulationAnalysis implements Analysis{

	@Autowired
	private ResponseValueService responseValueService;
	@Autowired
	private CrossTabulationData crossTabulationData;
	
	public CrossTabulationData getChartData(Integer firstId, Integer secondId) {
		@SuppressWarnings("rawtypes")
		List list=responseValueService.getDataForCrossTabulation(firstId,secondId);
		crossTabulationData.setData(list);
		return crossTabulationData;
	}

	/* (non-Javadoc)
	 * @see com.quicktap.analysis.Analysis#getChartData(java.lang.Integer, com.quicktap.analysis.ChartsEnum)
	 */
	@Override
	public ChartData getChartData(Integer questionId, ChartsEnum chart) {
		// TODO Auto-generated method stub
		return null;
	}

}
