/**
 * 
 */
package com.quicktap.analysis;

/**
 * @author Aashish
 *
 */
public enum ChartsEnum {
	PieChart("PieChart"), BarChart("BarChart"), Linechart("Line"), ColumnChart("ColumnChart"), 
	AreaChart("AreaChart"), SteppedAreaChart("SteppedAreaChart"), ComboChart("ComboChart"), 
	Histogram("Histogram"), GeoChart("GeoChart"), Map("Map"), NPS("Gauge"), 
	Quotes("Quotes"), OpenTextAnalysis("OpenTextAnalysis"), CrossTabulation("CrossTabulation");

	String googleValue;

	private ChartsEnum(String googleValue) {

		this.googleValue = googleValue;
	}

	public String getGoogleValue() {
		return this.googleValue;
	}
}
