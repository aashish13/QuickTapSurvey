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
	AreaChart("AreaChart"), SteppedAreaChart("SteppedAreaChart"), ComboChart("ComboChart"), Histogram("Histogram"), 
	GeoChart("GeoChart"), Map("PieChart"), GaugeChart("Gauge"),Quotes("Quotes");
	String googleValue;
	
	private ChartsEnum(String googleValue) {
		// TODO Auto-generated constructor stub
		this.googleValue=googleValue;
	}
	public String getGoogleValue(){
		return this.googleValue;
	}
}
