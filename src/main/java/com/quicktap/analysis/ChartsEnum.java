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
<<<<<<< HEAD
	GeoChart("GeoChart"), Map("Map"), GaugeChart("Gauge");
=======
	GeoChart("GeoChart"), Map("PieChart"), GaugeChart("Gauge"),Quotes("Quotes");
>>>>>>> 544eeeab0e39af35ee9c1a10a6d3fb3fe0ea7937
	String googleValue;
	
	private ChartsEnum(String googleValue) {
		// TODO Auto-generated constructor stub
		this.googleValue=googleValue;
	}
	public String getGoogleValue(){
		return this.googleValue;
	}
}
