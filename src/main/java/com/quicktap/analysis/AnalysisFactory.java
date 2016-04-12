/**
 * 
 */
package com.quicktap.analysis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Aashish
 *
 */
@Component
public class AnalysisFactory {
	@Autowired
	private CoreAnalysis coreAnalysis;
	@Autowired
	private MapAnalysis mapAnalysis;
	@Autowired
	private GaugeAnalysis gaugeAnalysis;
	@Autowired
	private GeoChartAnalysis geoChartAnalysis;
	@Autowired
	private OpenTextAnalysis openTextAnalysis;

	@Autowired
	private QuotesAnalysis quotesAnalysis;

	/**
	 * @param chartType
	 * @return
	 */
	public Analysis getAnalysisClass(ChartsEnum chartType) {

		Analysis analysis = null;
		switch (chartType) {
		case AreaChart:
		case PieChart:
		case BarChart:
		case Linechart:
		case ColumnChart:
		case SteppedAreaChart:
		case ComboChart:
		case Histogram:
			analysis = coreAnalysis;
			break;
		case GeoChart:
			analysis = geoChartAnalysis;
			break;
		case Map:
			analysis = mapAnalysis;
			break;
		case NPS:
			analysis = gaugeAnalysis;
			break;
		case Quotes:
			analysis = quotesAnalysis;
			break;
		case OpenTextAnalysis:
			analysis = openTextAnalysis;
			break;
		}
		return analysis;
	}

}
