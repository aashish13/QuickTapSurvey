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
<<<<<<< HEAD
	

=======
	@Autowired
	private QuotesAnalysis quotesAnalysis;
>>>>>>> 544eeeab0e39af35ee9c1a10a6d3fb3fe0ea7937
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
		case GaugeChart:
			analysis = gaugeAnalysis;
			break;

		case Quotes:
			analysis = quotesAnalysis;
			break;
		}
		return analysis;
	}

}
