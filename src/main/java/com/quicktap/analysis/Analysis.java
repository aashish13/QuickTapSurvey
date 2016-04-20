/**
 * 
 */
package com.quicktap.analysis;

import com.quicktap.model.ChartData;

/**
 * @author Aashish
 *
 */
public interface Analysis {
	public ChartData getChartData(Integer questionId, ChartsEnum chart);
}
